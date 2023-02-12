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
public class MotorBrushless {

    private boolean ready;
    private float voltsConsumido;
    private float amperesConsumidos;
    
    public MotorBrushless() {
        this.ready = false;
    }
    
    /**
     * @return the voltsConsumido
     */
    public float getVoltsConsumido() {
        return voltsConsumido;
    }

    /**
     * @param voltsConsumido the voltsConsumido to set
     */
    public void setVoltsConsumido(float voltsConsumido) {
        this.voltsConsumido = voltsConsumido;
    }

    /**
     * @return the amperesConsumidos
     */
    public float getAmperesConsumidos() {
        return amperesConsumidos;
    }

    /**
     * @param amperesConsumidos the amperesConsumidos to set
     */
    public void setAmperesConsumidos(float amperesConsumidos) {
        this.amperesConsumidos = amperesConsumidos;
    }
    
    public float potenciaConsumida() {
        return this.voltsConsumido * this.amperesConsumidos;
    }
    

    public void ready(boolean ready) {
        this.ready = ready;
    }

    public void activar() {
        if (this.ready) {
            System.err.println("Prendiendo motor Brushless");
        } else {
            System.err.println("No pudo prenderse el motor Brushless porque no esta ready");
        }
    }
    
    public void variarVelocidad() {
        if (this.ready) {
            System.err.println("Acelerando motor Brushless");
        } else {
            System.err.println("No pudo acelerarse el motor Brushless porque no esta ready");
        }
    }
    
    public void desactivar() {
        if (this.ready) {
            System.err.println("Apagando motor Brushless");
            this.ready = false;
        } else {
            System.err.println("No pudo apagarse el motor Brushless porque no esta ready");
        }
    }

    
    

}
