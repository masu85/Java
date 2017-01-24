package com.masu.java.designPatterns.FlyWeight;

/**
 * Patrón de diseño FlyWheight/PesoLigero.
 * 
 * Se utiliza cuando se tienen que crear multitud de objetos de un mismo tipo
 * y que comparten información, normalmente inmutable.
 * 
 * @author Masu
 * @version 1.0.0
 */



public class FlyWeightPattern 
{
    public static void main(String[] args)
    {
        StormTrooper st1 = FactoriaStormTroopers.crearStormTrooper(1, "Melee", "Katana");
        StormTrooper st2 = FactoriaStormTroopers.crearStormTrooper(2, "Rango", "PistolaLaser");
        StormTrooper st3 = FactoriaStormTroopers.crearStormTrooper(3, "Melee", "Katana");
        StormTrooper st4 = FactoriaStormTroopers.crearStormTrooper(4, "Melee", "Puñal");
        StormTrooper st5 = FactoriaStormTroopers.crearStormTrooper(5, "Rango", "PistolaLaser");
        StormTrooper st6 = FactoriaStormTroopers.crearStormTrooper(6, "Rango", "PistolaLaser");
        StormTrooper st7 = FactoriaStormTroopers.crearStormTrooper(7, "Rango", "PistolaLaser");
    }    
}
