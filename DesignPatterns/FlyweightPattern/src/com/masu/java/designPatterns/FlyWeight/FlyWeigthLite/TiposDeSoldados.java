package com.masu.java.designPatterns.FlyWeight.FlyWeigthLite;

import java.util.HashMap;
import java.util.Map;

/**
 *  Esta clase la utilizamos para guardar las cada combinación de "CarcateristicasStormTrooper" diferente que creemos.
 *  En el caso de que ya exista, devolvemos dicha instancia en lugar de crear una nueva
 * 
 * @author Masu
 */
public class TiposDeSoldados 
{
    private static Map<String,CaracteristcasStormTrooper> soldados = new HashMap<String, CaracteristcasStormTrooper>();
    
    public static CaracteristcasStormTrooper getSoldado(String rango, String tipoCombate, String armaPrincipal, String tipoArmadura)
    {
        String carcateristicas = rango + ":" + tipoCombate + ":" + armaPrincipal + ":" + tipoArmadura;

        /* Comprovamos si existe una configuración de características para el StormTrooper, y si no existe la creamos.
        *  Esto hace que las configuraciones sean únicas según el tipo, y no una configuración para cada StoormTrooper.
        */
        if (!soldados.containsKey(carcateristicas))
        {
            soldados.put(carcateristicas, new CaracteristcasStormTrooper(rango, tipoCombate, armaPrincipal, tipoArmadura));
        }
        
        return soldados.get(carcateristicas);
    }
}
