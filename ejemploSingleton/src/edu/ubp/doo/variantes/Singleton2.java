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
public class Singleton2 {
    private static Singleton2 instancia = null;
    
    static {
        instancia = new Singleton2();
    }
    
    private Singleton2(){
        
    }
    
    public static Singleton2 getInstancia() {
        return instancia;
    }
}
