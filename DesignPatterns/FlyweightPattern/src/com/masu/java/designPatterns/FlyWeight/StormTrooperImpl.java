package com.masu.java.designPatterns.FlyWeight;

/**
 * Implementación de la interfície de los StormTrooper donde se definen los métodos para obtener la información de los soldados.
 * 
 * @author Masu
 */
public class StormTrooperImpl implements StormTrooper
{
    private final int numStormTrooper;
    private CaracteristcasStormTrooper soldado;

    public StormTrooperImpl(int numStormTrooper, CaracteristcasStormTrooper soldado)
    {
        this.numStormTrooper = numStormTrooper;
        
        System.out.println("StormTroopers creados: " + numStormTrooper);
    }

    @Override
    public int getNumSotrmTrooper()
    {
        return this.numStormTrooper;
    }

    public String getEspecialidad()
    {
        return soldado.getEspecialidad();
    }

    public String getArmaPrincipal()
    {
        return soldado.getArmaPrincipal();
    }    
}
