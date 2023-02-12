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
public class DvdSimple extends Disco{

    @Override
    public String getCapacidad() {
        return "4.7 GB";
    }

    @Override
    public String getNombre() {
        return "DVD simple capa";
    }

    @Override
    public float getPrecio() {
        return 10.0f;
    }
    
}
