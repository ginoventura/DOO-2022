/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ubp.doo.main;

import edu.ubp.doo.modelo.AdaptadorMotorBrushless;
import edu.ubp.doo.modelo.Motor;
import edu.ubp.doo.modelo.MotorDiesel;
import edu.ubp.doo.modelo.MotorOtto;

/**
 *
 * @author agustin
 */
public class EjemploAdapter {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        
        Motor motor = new MotorDiesel();
        motor.encender();
        motor.acelerar();
        motor.apagar();
        
        Thread.sleep(1000);
        
        
        motor = new MotorOtto();
        motor.encender();
        motor.acelerar();
        motor.apagar();
        
        Thread.sleep(1000);
        
        motor = new AdaptadorMotorBrushless();
        motor.encender();
        motor.acelerar();
        motor.apagar();
        
        
    }
    
}
