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
public class Embrague implements IEmbrague{

    @Override
    public void apretarEmbrague() {
        System.out.println("Pedal Embrague presionado");
    }

    @Override
    public void soltarEmbrague() {
        System.out.println("Pedal Embrague suelto");
    }
    
}
