package com.masu.java.designPatterns.FlyWeight;

/**
 * Factoria para crear StormTroopers a mansalva y rebentar a la insignificantes fuerzas de la república que aún se oponen
 * al muy honorable Lord Vader.
 * 
 * @author Masu
 */
public class FactoriaStormTroopers
{
    public static StormTrooper crearStormTrooper(int numStormTrooper, String rango, String tipoCombate, String armaPrincipal, String tipoArmadura)
    {
        CaracteristcasStormTrooper soldado = RegistroSoldados.getSoldado(rango, tipoCombate, armaPrincipal, tipoArmadura);
        
        StormTrooper stormTrooper = new StormTrooperImpl(numStormTrooper, soldado);
        
        return stormTrooper;
    }  
}
