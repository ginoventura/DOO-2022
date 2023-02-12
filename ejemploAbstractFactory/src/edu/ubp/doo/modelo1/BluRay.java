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
public class BluRay extends Disco {

    public BluRay(String tipoDisco) {
        super.setTipoDisco(new TipoDisco(tipoDisco));
    }

    @Override
    public String getCapacidad() {
        return super.getTipoDisco().getTipo().equals("SIMPLE") ? "20 GB" : "50 GB";
    }

    @Override
    public String getNombre() {
        return super.getTipoDisco().getTipo().equals("SIMPLE") ? "Blu-Ray simple capa" : "Blu-Ray doble capa";
    }

    @Override
    public float getPrecio() {
        return super.getTipoDisco().getTipo().equals("SIMPLE") ? 50.0f : 100.0f;
    }

}
