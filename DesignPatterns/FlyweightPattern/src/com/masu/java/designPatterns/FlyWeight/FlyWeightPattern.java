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
        /*
            Imaginemos que el señor Darth Vader se aburre y le entra el capricho de invadir la galaxia, así, porque sí.
            Para ello necesita un ejército de un millón de soldados de esos que no haciertan ni un disparo estando a
            5cm del objetivo. (https://www.facebook.com/Funidelia/videos/1434017589964060/)
        */
        
        /* Para ello crearemos una factoría para crear los StormTroopers*/
        
        StormTrooper st1 = FactoriaStormTroopers.crearStormTrooper(1, "Melee", "Katana");
        StormTrooper st2 = FactoriaStormTroopers.crearStormTrooper(2, "Rango", "PistolaLaser");
        StormTrooper st3 = FactoriaStormTroopers.crearStormTrooper(3, "Melee", "Katana");
        StormTrooper st4 = FactoriaStormTroopers.crearStormTrooper(4, "Melee", "Puñal");
        StormTrooper st5 = FactoriaStormTroopers.crearStormTrooper(5, "Rango", "PistolaLaser");
        StormTrooper st6 = FactoriaStormTroopers.crearStormTrooper(6, "Rango", "PistolaLaser");
        StormTrooper st7 = FactoriaStormTroopers.crearStormTrooper(7, "Rango", "PistolaLaser");
    }    
}
