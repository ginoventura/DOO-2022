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
public class DvdDoble extends Disco{

    @Override
    public String getCapacidad() {
        return "8.5 GB";
    }

    @Override
    public String getNombre() {
        return "DVD doble capa";
    }

    @Override
    public float getPrecio() {
        return 20.0f;
    }
    
}
