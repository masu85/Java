package com.masu.java.designPatterns.FlyWeight.FlyWeigthLite;

/**
 * Patrón de diseño FlyWheight/PesoLigero.
 * 
 * Se utiliza cuando se tienen que crear multitud de objetos de un mismo tipo
 * y que comparten información, normalmente inmutable.
 * 
 * Nota: No se han creado Interfaces ni Factorías para hacer el ejemplo lo más sencillo posible (Versión Lite)
 * 
 * @author Masu
 * @version 1.0.0
 */

public class FlyWeightPattern 
{
    /*  Vamos a realizar un prodecimiento donde se van a crear 1.000.000 de StormTroopers para que Darth Vader conquiste la galaxia.
    *   
    *   Los soldados pueden tener 5 características que se repiten en múltiples soldados. Vamos a utilizar
    *   el patron FlyWeight para reducir el consumo de memória.
    *
    */
    public static void main(String[] args)
    {
        /* Creamos el millón de soldados con sus características */    
        for(int i = 0; i < 1000000; i++)
        {
            if(i % 13 == 0)
            {
                new StormTrooperLite(i, "SoldadoRaso", "Rango", "RifleLaserLargaDistancia", "Básica");
            }
            else if(i % 7 == 0)
            {
                new StormTrooperLite(i, "InfaneríaPesada", "Rango", "CañonLaser", "Básica");
            }
            else if(i % 5 == 0)
            {
                new StormTrooperLite(i, "SoldadoRaso", "Melee", "Katana", "Reforzada");
            }
            else if(i % 3 == 0)
            {
                new StormTrooperLite(i, "Conductor", "Melee", "Puñal", "Básica");
            }
            else
            {
                new StormTrooperLite(i, "SoldadoRaso", "Rango", "PistolaLaser", "Básica");
            }
        }
        
        /* 
            Al final hemos creado un millón de StormTroopers, pero sólo 5 "CaracterísticasStormTrooper".
            Si hubieramos puesto las carcaterísticas en la clase StormTrooper habríamos creado 4 variables por StormTrooper.
        
            Resultado: en lugar de utilizar memória para 4.000.000 de variables, solo hemos creado 20, ya que hemos reutilizado los objetos CaracterísticasStormTrooper.
        */
    }    
}
