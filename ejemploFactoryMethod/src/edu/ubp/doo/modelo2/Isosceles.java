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
public class Isosceles extends Triangulo{

    public Isosceles(double... lados) {
        super(lados);
    }

    @Override
    public String getNombre() {
        return "Soy un triangulo Isosceles";
    }
    
}
