/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ubp.doo.modelo2;

/**
 * Se refiere al componente ConcreteProduct del patrón
 * @author agustin
 */
public class Equilatero extends Triangulo{

    public Equilatero(double... lados) {
        super(lados);
    }

    @Override
    public String getNombre() {
        return "Soy un triangulo Equilatero";
    }
    
}
