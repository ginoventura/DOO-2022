
package edu.ubp.doo.main;

//import pp.modelo1.Triangulo;

import edu.ubp.doo.modelo.Triangulo;
import edu.ubp.doo.modelo.TrianguloFactory;

public class EjemploFactoryMethod {
    
    public static void main(String[] args) {
          Triangulo triangulo = new TrianguloFactory().crearTriangulo(140, 130, 100);
          System.out.println(triangulo.getNombre());
          System.out.print("Superficie: ");
          System.out.println(triangulo.calcularSuperficie());
          
          triangulo = new TrianguloFactory().crearTriangulo(100, 100, 100);
          System.out.println(triangulo.getNombre());
          System.out.print("Superficie: ");
          System.out.println(triangulo.calcularSuperficie());
          
//        Triangulo triangulo = TrianguloFactory.crearTriangulo(150, 150, 150);
//        System.out.println(triangulo.getNombre());
//        System.out.println("Mi superficie es: " + triangulo.calcularSuperficie());
        
//        Triangulo triangulo = TrianguloFactory.crearTriangulo(40, 40, 40);
//        System.out.println(triangulo.getNombre());
//        System.out.println("Mi superficie es: " + triangulo.calcularSuperficie());
//        triangulo = TrianguloFactory.crearTriangulo(40, 40, 30);
//        System.out.println(triangulo.getNombre());
//        System.out.println("Mi superficie es: " + triangulo.calcularSuperficie());
//        Triangulo triangulo = TrianguloFactory.crearTriangulo(3, 3, 5);
//        System.out.println(triangulo.getNombre());
//        System.out.println("Mi superficie es: " + triangulo.calcularSuperficie());
    }
}
