
package edu.ubp.doo.modelo;

import java.lang.reflect.InvocationTargetException;

public abstract class Modelo {
    
//   /***
//    * Si no les gusta este factory de modelos usando reflection
//    * pueden utilizar el que se hace con un switch
//    * @param nombreClaseModelo
//    * @return 
//    */ 
//   public static Modelo fabircarModelo(String nombreClaseModelo) {
//        Modelo modelo = null;
//        try {            
//            modelo = (Modelo) Class.forName(Modelo.class.getPackageName() + "." + nombreClaseModelo).getDeclaredConstructor().newInstance();
//        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
//            System.err.println(e);
//        }
//        return modelo;
//   } 
    
}
