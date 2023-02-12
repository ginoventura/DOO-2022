/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubp.doo.modelo1;

/***
 * Se refiere al componente Creator y ConcreteCreator del patrón
 * @author agustin
 */
public class TrianguloFactory {

    private TrianguloFactory() {
        
    }
    
    public static Triangulo crearTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado1 == lado3) {
            return new Equilatero(lado1, lado2, lado3);
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            return new Escaleno(lado1, lado2, lado3);
        } else {
            return new Isosceles(lado1, lado2, lado3);
        }
    }

}
