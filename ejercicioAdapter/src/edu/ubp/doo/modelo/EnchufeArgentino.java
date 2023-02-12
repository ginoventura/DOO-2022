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
public class EnchufeArgentino implements IEnchufeEuropeo{

    @Override
    public int voltaje220V() {
        return 220;
    }

    @Override
    public int cantidadPatas() {
        return 2;
    }
    
}
