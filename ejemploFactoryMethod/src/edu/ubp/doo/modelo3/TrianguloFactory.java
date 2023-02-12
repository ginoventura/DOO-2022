package edu.ubp.doo.modelo3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * *
 * Se refiere al componente Creator y ConcreteCreator del patrón
 *
 * @author agustin
 */
public class TrianguloFactory {

    private TrianguloFactory() {

    }
    /*
     * Usando reflection de Java
     * @param lados
     * @return 
     */
    public static Triangulo crearTriangulo(double... lados) {
        Triangulo triangulo = null;
        try {
            Class clase = ((lados[0] == lados[1] && lados[0] == lados[2]) ? Equilatero.class : (lados[0] != lados[1] && lados[0] != lados[2] && lados[1] != lados[2]) ? Escaleno.class : Isosceles.class);
            
            Constructor constru =  clase.getConstructor(double[].class);
            
            triangulo = (Triangulo) constru.newInstance(lados);
            
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            System.err.println(ex);
        }
        return triangulo;
    }
}
