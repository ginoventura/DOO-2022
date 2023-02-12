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
public class PalancaCambios implements IPalancaCambios{

    //punto muerto = 0, 1ra = 1, 2da = 2, 3ra = 3, 4ta = 4, 5ta = 5
    private int velocidad;
    
    @Override
    public void cambiarVelocidad(int velocidad) {
        this.velocidad = velocidad;
        System.out.println("Colocando velocidad " + this.velocidad);
    }

    @Override
    public void pasarPuntoMuerto() {
        this.velocidad = 0;
        System.out.println("Pasando por punto muerto");
    }

    @Override
    public int getVelocidadActual() {
        return this.velocidad;
    }
    
}
