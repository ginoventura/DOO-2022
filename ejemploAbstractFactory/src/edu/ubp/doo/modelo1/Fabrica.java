/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ubp.doo.modelo1;

/**
 *
 * @author agustin
 */
public class Fabrica {
    
    public static FabricaDisco crearFabrica(String tipoDisco){
        switch(tipoDisco){
            case "SIMPLE":
                return new edu.ubp.doo.modelo1.FabricaDiscoSimple();
            case "DOBLE":
                return new edu.ubp.doo.modelo1.FabricaDiscoDoble();
            default: return null;
        }
    }
    
    
}
