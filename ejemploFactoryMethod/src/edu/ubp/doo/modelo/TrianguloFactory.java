/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubp.doo.modelo;

/***
 * Se refiere al componente ConcreteCreator del patrón
 * @author agustin
 */
public class TrianguloFactory extends TrianguloFactoryMethod {

    @Override
    public Triangulo crearTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado1 == lado3) {
            return new edu.ubp.doo.modelo.Equilatero(lado1, lado2, lado3);
        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            return new edu.ubp.doo.modelo.Escaleno(lado1, lado2, lado3);
        } else {
            return new edu.ubp.doo.modelo.Isosceles(lado1, lado2, lado3);
        }
    }

}
