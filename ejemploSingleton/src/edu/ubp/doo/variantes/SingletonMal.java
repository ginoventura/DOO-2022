/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ubp.doo.variantes;

/**
 * Esta es una mala implementación del patrón singleton,
 * si sabes porque por favor corrige el error y comentalo!!!
 * @author agustin
 */
public class SingletonMal {
    
    private static SingletonMal instancia = null;

    /**
     * Mal!!! el constructor debe ser declarado como 
     * privado.
     */
    public SingletonMal() {
    }
    
    
    /**
     * @return the instancia
     */
    public static SingletonMal getInstancia() {
        if(instancia == null){
            instancia = new SingletonMal();
        }
        return instancia;
    }
}
