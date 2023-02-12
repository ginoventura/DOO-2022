/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ubp.doo.modelo1;

/**
 *
 * @author agustin
 */
public class TipoDisco {
    
    //Simple o Doble
    private String tipo;
    
    
    
    public TipoDisco(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
