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
public class FabricaDiscoDoble implements FabricaDisco{

    @Override
    public Disco crearDvd() {
        return new DvdDoble();
    }

    @Override
    public Disco crearBluRay() {
        return new BluRayDoble();
    }

    @Override
    public Disco crearCd() {
        return new CdDoble();
    }
    
}
