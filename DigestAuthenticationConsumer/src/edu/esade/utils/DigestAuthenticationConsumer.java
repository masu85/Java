package edu.esade.utils;

import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.auth.AUTH;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.ContextAwareAuthScheme;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.DigestScheme;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

/**
 * Clase Java para el consumo de servicios con DigestAuthentication.
 * Realizada con métodos estaticos para que se pueda utilizar desde el OSB
 * 
 * @author Masu
 * @version 1.0.0
 */
public class DigestAuthenticationConsumer
{
    /**
     * Realiza una llamada a un servicio de tipo REST utilizando el método POST.
     * El consumo del servicio se realiza utilizando el método de autentificación DigestAuthentication
     * realizando una llamda inicial con resultado Unauthorized para obtener el Realm y los
     * otros parámetros y finalmente se realiza una segunda llamda con los datos codificados para 
     * obtener el resultado final.
     * 
     * @param urlService  Url REST que se va a consumir
     * @param body        Texto con estrucutura JSON con la información y parámetros que se envían al servicio
     * @param user        Usuario para consumir el servicio
     * @param password    Passoword del usuario
     *
     * @return String
     * 
     * 
     * @throws IOException 
     * @throws org.apache.http.client.ClientProtocolException
     * @throws org.apache.http.auth.MalformedChallengeException 
     * @throws org.apache.http.auth.AuthenticationException 
    */
    public static String postConsume(String urlService, String body, String user, String password) throws ClientProtocolException, MalformedChallengeException, AuthenticationException, IOException, Exception
    {
        String result = "";
        
        CloseableHttpClient client401      = HttpClientBuilder.create().build();
        CloseableHttpClient clientResponse = HttpClientBuilder.create().build();
        
        HttpPost httpPost = new HttpPost(urlService);
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-type", "application/json; charset=UTF-8");

        try
        {
            //Request inicial sin credenciales que devuelve "HTTP/1.1 401 Unauthorized"
            HttpResponse response = client401.execute(httpPost);
            
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_UNAUTHORIZED)
            {
                //Obtenemos la cabecera "WWW-Authenticate" de la respuesta
                //WWW-Authenticate:Digest realm="My Test Realm", qop="auth", 
                Header authHeader = response.getFirstHeader(AUTH.WWW_AUTH);

                //Parseamos el realm y el nonce que nos ha enviado el servidor.                 
                ContextAwareAuthScheme digestScheme = new DigestScheme();
                digestScheme.processChallenge(authHeader);
                
                HttpContext httpContext = new BasicHttpContext();
                UsernamePasswordCredentials creds = new UsernamePasswordCredentials(user, password);
                
                //Establecemos la cabecera y el cuerpo que enviarà la llamada
                httpPost.addHeader(digestScheme.authenticate(creds, httpPost, httpContext));
                httpPost.setEntity(new StringEntity(body));
                
                //Realizamos la segunda llamada
                CloseableHttpResponse closeableResponse = clientResponse.execute(httpPost, httpContext);
                result = EntityUtils.toString(closeableResponse.getEntity());
            }
        }
        finally
        {
            client401.close();
            clientResponse.close();
        }
        
        return result;
    }
}