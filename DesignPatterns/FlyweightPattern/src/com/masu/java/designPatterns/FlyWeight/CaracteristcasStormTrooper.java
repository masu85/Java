package com.masu.java.designPatterns.FlyWeight;

/**
 *  Clase genérica para definir y controlar las características que puede tener un StormTrooper.
 * 
 *  @author Masu
 */
public class CaracteristcasStormTrooper
{
    private static int tipoSoldadosCreados;
    
    private String especialidad;
    private String armaPrincipal;

    public CaracteristcasStormTrooper(String especialidad, String armaPrincipal)
    {
        this.especialidad  = especialidad;
        this.armaPrincipal = armaPrincipal;    
        
        tipoSoldadosCreados++;
        
        System.out.println("Tipos de Soldados Creados: " + tipoSoldadosCreados);
    }
    
    public String getEspecialidad()
    {
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad)
    {
        this.especialidad = especialidad;
    }
    
    public String getArmaPrincipal()
    {
        return armaPrincipal;
    }
    
    public void setArmaPrincipal(String armaPrincipal)
    {
        this.armaPrincipal = armaPrincipal;
    }
}