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
public class Cd extends Disco {

    public Cd(String tipoDisco) {
        super.setTipoDisco(new TipoDisco(tipoDisco));
    }

    @Override
    public String getCapacidad() {
        return super.getTipoDisco().getTipo().equals("SIMPLE") ? "700 MB" : "1.5 GB";
    }

    @Override
    public String getNombre() {
        return super.getTipoDisco().getTipo().equals("SIMPLE") ? "CD Simple" : "CD Doble";
    }

    @Override
    public float getPrecio() {
        return super.getTipoDisco().getTipo().equals("SIMPLE") ? 5.0f : 10.0f;
    }

}
