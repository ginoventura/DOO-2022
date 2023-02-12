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
public class CdSimple extends Disco{

    @Override
    public String getCapacidad() {
        return "700 MB";
    }

    @Override
    public String getNombre() {
        return "CD Simple Capa";
    }

    @Override
    public float getPrecio() {
        return 5.0f;
    }
    
}
