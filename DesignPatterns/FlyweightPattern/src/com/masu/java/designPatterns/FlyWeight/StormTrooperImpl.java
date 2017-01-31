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

    @Override
    public String getRango() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTipoCombate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getArmaPrincipal()
    {
        return soldado.getArmaPrincipal();
    }    

    @Override
    public String getTipoArmadura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
