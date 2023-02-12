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
public class FabricaDiscoSimple implements FabricaDisco{

    @Override
    public Disco crearDvd() {
        return new Dvd("SIMPLE");
    }

    @Override
    public Disco crearBluRay() {
        return new BluRay("SIMPLE");
    }

    @Override
    public Disco crearCd() {
        return new Cd("SIMPLE");
    }
    
}
