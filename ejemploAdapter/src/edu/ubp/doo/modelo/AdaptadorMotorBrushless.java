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
public class AdaptadorMotorBrushless implements Motor {

    MotorBrushless motorBrushless;

    public AdaptadorMotorBrushless() {
        this.motorBrushless = new MotorBrushless();
    }
    
    @Override
    public void encender() {
        this.motorBrushless.ready(true);
        this.motorBrushless.activar();
    }

    @Override
    public void apagar() {
        this.motorBrushless.desactivar();
    }

    @Override
    public void acelerar() {
        this.motorBrushless.ready(true);
        this.motorBrushless.variarVelocidad();
    }
    
}
