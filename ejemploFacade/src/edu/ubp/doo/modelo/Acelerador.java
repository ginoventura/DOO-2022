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
public class Acelerador implements IAcelerador{

    @Override
    public void apretarAcelerador() {
        System.out.println("Pedal Acelerador presionado\n");
    }

    @Override
    public void soltarAcelerador() {
         System.out.println("Pedal Acelerador suelto");
    }
    
}
