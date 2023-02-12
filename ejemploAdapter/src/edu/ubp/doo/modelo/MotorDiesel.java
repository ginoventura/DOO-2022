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
public class MotorDiesel implements Motor{

    public MotorDiesel() {
    }
    
    @Override
    public void acelerar() {
        System.out.println("Acelerando motor Diesel");
    }

    @Override
    public void encender() {
        System.out.println("Prendiendo motor Diesel");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor Diesel");
    }
    
}
