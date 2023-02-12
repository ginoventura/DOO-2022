/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubp.doo.modelo2;


/***
 * Se refiere al componente Creator y ConcreteCreator del patrón
 * @author agustin
 */
public class TrianguloFactory {

    private TrianguloFactory() {
        
    }
    
    public static Triangulo crearTriangulo(double... lados) {
        if (lados[0] == lados[1] && lados[0] == lados[2]) {
            return new Equilatero(lados);
        } else if (lados[0] != lados[1] && lados[0] !=  lados[2] && lados[1] != lados[2]) {
            return new Escaleno(lados);
        } else {
            return new Isosceles(lados);
        }
    }

}
