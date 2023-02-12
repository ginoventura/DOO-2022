
package edu.ubp.doo.main;

import edu.ubp.doo.modelo.Bd;
import edu.ubp.doo.modelo.BdFactory;

public class ejercicioFactoryMethod {

    public static void main(String[] args) {
        
        Bd basedato = BdFactory.crearConexionBd("mysql");
        //Bd basedato = new BdFactory().crearConexionBd("mySQL");
        System.out.println("Soy una conexion a: ");
        System.out.println(basedato.getCadenaConexion());
        basedato.insert();
        basedato.delete();
        basedato.update();
//      System.out.println(basedato.update());
        
        basedato = new BdFactory().crearConexionBd("oracle");
        System.out.println("Soy una conexion a: ");
        System.out.println(basedato.getCadenaConexion());
        basedato.delete();
        basedato.update();
    }   
}


