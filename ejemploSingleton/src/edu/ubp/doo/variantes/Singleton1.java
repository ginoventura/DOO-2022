/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubp.doo.variantes;

/**
 *
 * @author agustin
 */
public class Singleton1 {
    
    private static Singleton1 instancia = null;
    
    private Singleton1(){
        
    }
    
    public static Singleton1 getInstancia() {
        if(instancia == null) {
            instancia = new Singleton1();
        }
        return instancia;
    }
    
    
}
