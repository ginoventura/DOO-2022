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
public class BluRayDoble extends Disco{

    @Override
    public String getCapacidad() {
        return "50 GB";
    }

    @Override
    public String getNombre() {
        return "Blu-Ray doble capa";
    }

    @Override
    public float getPrecio() {
        return 100.0f;
    }
    
}
