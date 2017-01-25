package com.masu.java.designPatterns.FlyWeight;

/**
 * Factoria para crear StormTroopers a mansalva y rebentar a la insignificantes fuerzas de la república que aún se oponen
 * al muy honorable Lord Vader.
 * 
 * @author Masu
 */
public class FactoriaStormTroopers
{
    public static StormTrooper crearStormTrooper(int numStormTrooper, String especialidad, String armaPrincipal)
    {
        
        CaracteristcasStormTrooper soldado = RegistroSoldados.getSoldado(especialidad, armaPrincipal);
        
        StormTrooper stormTrooper = new StormTrooperImpl(numStormTrooper, soldado);
        
        return stormTrooper;
    }  
}
