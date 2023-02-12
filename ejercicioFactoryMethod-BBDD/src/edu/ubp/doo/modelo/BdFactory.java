package edu.ubp.doo.modelo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BdFactory {

    public static Bd crearConexionBd(String cadenaConexion) {
        Bd bd = null;
//        if (cadenaConexion.toLowerCase().contains("mysql")) {
//            bd = new BdMySql(cadenaConexion);
//        } else {
//            bd = new BdOracle(cadenaConexion);
//        }
        try {
            Class clase;
            if (cadenaConexion.toLowerCase().contains("mysql")) {
                clase = BdMySql.class;
            } else {
                clase = BdOracle.class;
            }
            Constructor constructor = clase.getConstructor(String.class);
            bd = (Bd) constructor.newInstance(cadenaConexion);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            System.err.println(e);
        }
        return bd;
    }
}
