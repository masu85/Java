package com.masu.java.designPatterns.FlyWeight.FlyWeigthLite;

/**
 *  Esta es la clase para los objetos donde vamos a definir las cualidades de los StoormTroopers que vamos a creear.
 *  Por desgracia la cualidad "MatarJedis" no está disponible :(
 * 
 *  @author Masu
 */
public class CaracteristcasStormTrooper
{
    /* Variable para contar los tipos de StormTrooper que se crean. La utilizamos solo para el ejemplo */
    private static int tiposSoldadosCreados;
    
    private String rango;
    private String tipoCombate;
    private String armaPrincipal;
    private String tipoArmadura;

    public CaracteristcasStormTrooper(String rango, String tipoCombate, String armaPrincipal, String tipoArmadura)
    {
        this.rango  = rango;
        this.tipoCombate = tipoCombate;
        this.armaPrincipal = armaPrincipal;
        this.tipoArmadura = tipoArmadura;
        
        tiposSoldadosCreados++;
        
        System.out.println("Tipos de Soldados Creados: " + tiposSoldadosCreados);
    }
    
    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getTipoCombate() {
        return tipoCombate;
    }

    public void setTipoCombate(String tipoCombate) {
        this.tipoCombate = tipoCombate;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public String getTipoArmadura() {
        return tipoArmadura;
    }

    public void setTipoArmadura(String tipoArmadura) {
        this.tipoArmadura = tipoArmadura;
    }
}