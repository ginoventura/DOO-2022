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
public class Dvd extends Disco {

    public Dvd(String tipoDisco) {
        super.setTipoDisco(new TipoDisco(tipoDisco));
    }

    @Override
    public String getCapacidad() {
        return super.getTipoDisco().getTipo().equals("SIMPLE") ? "4.7 GB" : "8.5 GB";
    }

    @Override
    public String getNombre() {
        return super.getTipoDisco().getTipo().equals("SIMPLE") ? "DVD simple capa" : "DVD doble capa";
    }

    @Override
    public float getPrecio() {
        return super.getTipoDisco().getTipo().equals("SIMPLE") ? 10.0f : 20.0f;
    }

}
