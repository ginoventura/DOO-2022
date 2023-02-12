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
public class Licuadora {
    public IEnchufeEuropeo enchufe;

    public Licuadora(IEnchufeEuropeo enchufe) {
        this.enchufe = enchufe;
    }
    
    public void encender(){
        System.out.printf("Licuadora funcionando a %d volts con un enchufe de %d patas\n", this.enchufe.voltaje220V(), this.enchufe.cantidadPatas());
    }
    
    public void apagar(){
        System.out.printf("Licuadora apagada a usando un enchufe de %d patas\n", this.enchufe.cantidadPatas());
    }
}
