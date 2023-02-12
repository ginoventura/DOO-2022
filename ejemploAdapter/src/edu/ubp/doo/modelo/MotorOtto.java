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
public class MotorOtto implements Motor{

    public MotorOtto() {
    }
    
    @Override
    public void acelerar() {
        System.out.println("Acelerando motor Otto");
    }

    @Override
    public void encender() {
        System.out.println("Prendiendo motor Otto");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor Otto");
    }
    
}
