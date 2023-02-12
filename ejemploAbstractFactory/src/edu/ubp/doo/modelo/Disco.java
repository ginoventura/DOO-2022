/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubp.doo.modelo;

/**
 *
 * @author agustin
 */
public abstract class Disco {

    public abstract String getCapacidad();

    public abstract String getNombre();

    public abstract float getPrecio();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Disco {Nombre: ").append(getNombre()).append(", Capacidad: ").append(getCapacidad()).append(", Precio: $").append(getPrecio()).append("}");
        return sb.toString();
    }

    
}
