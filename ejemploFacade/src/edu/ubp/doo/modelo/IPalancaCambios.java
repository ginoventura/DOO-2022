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
public interface IPalancaCambios {
    
    void cambiarVelocidad(int velocidad);
    void pasarPuntoMuerto();
    int getVelocidadActual();
}
