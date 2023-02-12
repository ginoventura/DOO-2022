/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubp.doo.modelo1;

/**
 *
 * @author agustin
 */
public abstract class Disco {

    private TipoDisco tipoDisco;
    
    public abstract String getCapacidad();

    public abstract String getNombre();

    public abstract float getPrecio();
    
    /**
     * 
     * @param tipoDisco 
     */
    public void setTipoDisco(TipoDisco tipoDisco){
        this.tipoDisco = tipoDisco;
    }
    
    /**
     * @return the tipoDisco
     */
    public TipoDisco getTipoDisco() {
        return tipoDisco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Disco {Nombre: ").append(getNombre()).append(", Capacidad: ").append(getCapacidad()).append(", Precio: $").append(getPrecio()).append("}");
        return sb.toString();
    }

    

    
}
