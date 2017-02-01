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
        
            El problema es que quiere guardar los datos de todos los soldados en su PenDrive para poder conectarlo en el 
            aparato de lucecitas que lleva en el pecho.
        
            Guardar la información de todos los soldados ocuparía mucho espacio en en el pendrive, así que utilizaremos el 
            patrón FlyWeightPattern para reducir la cantidad de información.
        */
        
        /* Para crear el millon de soldados utilizaremos una factoría de soldados, donde para cada soldado le indicaremos una série de características */
        for(int i = 0; i < 1000000; i++)
        {
            if(i % 13 == 0)
            {
                FactoriaStormTroopers.crearStormTrooper(i, "SoldadoRaso", "Rango", "RifleLaserLargaDistancia", "Básica");
            }
            else if(i % 7 == 0)
            {
                FactoriaStormTroopers.crearStormTrooper(i, "InfaneríaPesada", "Rango", "CañonLaser", "Básica");
            }
            else if(i % 5 == 0)
            {
                FactoriaStormTroopers.crearStormTrooper(i, "SoldadoRaso", "Melee", "Katana", "Reforzada");
            }
            else if(i % 3 == 0)
            {
                FactoriaStormTroopers.crearStormTrooper(i, "Conductor", "Melee", "Puñal", "Básica");
            }
            else
            {
                FactoriaStormTroopers.crearStormTrooper(i, "SoldadoRaso", "Rango", "PistolaLaser", "Básica");
            }
        }
    }    
}
