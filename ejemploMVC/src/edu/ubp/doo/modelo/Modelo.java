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
public class Modelo {

    protected int numero1;
    protected int numero2;

    /**
     * @return the numero1
     */
    public int getNumero1() {
        return numero1;
    }

    /**
     * @param numero1 the numero1 to set
     */
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    /**
     * @return the numero2
     */
    public int getNumero2() {
        return numero2;
    }

    /**
     * @param numero2 the numero2 to set
     */
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int sumar() {
        return getNumero1() + getNumero2();
    }

    public int restar() {
        return getNumero1() - getNumero2();
    }

    public int multiplicar() {
        return getNumero1() * getNumero2();
    }

    public int dividir() {
        return getNumero1() / getNumero2();
    }
}
