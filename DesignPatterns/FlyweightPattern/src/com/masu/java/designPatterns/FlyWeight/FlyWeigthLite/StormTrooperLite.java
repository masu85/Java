package com.masu.java.designPatterns.FlyWeight.FlyWeigthLite;

/**
 * Clase StoormTrooper que utilizaremos para crear los soldados
 * 
 * @author Masu
 */

public class StormTrooperLite
{
    /* Variable donde guardaremos el Numero de soldado */
    private final int numStormTrooper;
    
    /* Objeto donde guardaremos las características del soldado */
    private final CaracteristcasStormTrooper soldado;
    
    /* Constructor del StormTrooper */
    public StormTrooperLite(int numStormTrooper, String rango, String tipoCombate, String armaPrincipal, String tipoArmadura)
    {     
        this.numStormTrooper = numStormTrooper;
        this.soldado = TiposDeSoldados.getSoldado(rango, tipoCombate, armaPrincipal, tipoArmadura);
  
        System.out.println("StormTroopers creados: " + numStormTrooper);
    }

    public int getNumSotrmTrooper()
    {
        return this.numStormTrooper;
    }

    public String getRango()
    {
        return soldado.getRango();
    }

    public String getTipoCombate() {
        return soldado.getTipoCombate();
    }
    
    public String getArmaPrincipal()
    {
        return soldado.getArmaPrincipal();
    }    

    public String getTipoArmadura()
    {
        return soldado.getTipoArmadura();
    }
}
