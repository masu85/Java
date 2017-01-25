package com.masu.java.designPatterns.FlyWeight;

/**
 *  Interfície principal de StormTrooper.
 *  Contiene las fucniones para obtener el numero de soldado y las caracteríticas de cada StormTrooper al orden del Imperio.
 * 
 * @author Masu
 */
public interface StormTrooper
{
    public int getNumSotrmTrooper();

    public String getRango();
    
    public String getTipoCombate();

    public String getArmaPrincipal();
    
    public String getTipoArmadura();

}
