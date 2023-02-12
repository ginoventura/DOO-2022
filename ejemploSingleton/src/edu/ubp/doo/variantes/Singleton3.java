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
public class Singleton3 {
    
    private static Singleton3 instancia = new Singleton3();
    
    private Singleton3() {
        
    }
    
    public static Singleton3 getInstancia() {
        return instancia;
    }
}
