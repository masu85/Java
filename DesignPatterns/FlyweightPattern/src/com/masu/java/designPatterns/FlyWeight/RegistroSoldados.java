/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masu.java.designPatterns.FlyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Masu
 */
public class RegistroSoldados 
{
    private static Map<String,CaracteristcasStormTrooper> soldados= new HashMap<String, CaracteristcasStormTrooper>();
    
    public static CaracteristcasStormTrooper getSoldado(String especialidad, String armaPrincipal)
    {
        String carcateristicas = especialidad + ":" + armaPrincipal;

        if (!soldados.containsKey(carcateristicas))
        {
            soldados.put(carcateristicas, new CaracteristcasStormTrooper(especialidad, armaPrincipal));
        }
        
        return soldados.get(carcateristicas);
    }
}
