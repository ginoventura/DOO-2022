/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubp.doo.main;

import edu.ubp.doo.modelo.Disco;
import edu.ubp.doo.modelo.FabricaDisco;
import edu.ubp.doo.modelo.FabricaDiscoDoble;
import edu.ubp.doo.modelo.FabricaDiscoSimple;

/**
 *
 * @author agustin
 */
public class EjemploAbstractFactory {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        FabricaDisco fabrica;
//        Disco disco;
//        
//        fabrica = new FabricaDiscoSimple();
//        disco = fabrica.crearDvd();
//        System.out.println(disco);
//        
//        disco = fabrica.crearBluRay();
//        System.out.println(disco);
//        
//        disco = fabrica.crearCd();
//        System.out.println(disco);
//        
//        fabrica = new FabricaDiscoDoble();
//        disco = fabrica.crearDvd();
//        System.out.println(disco);
//        
//        disco = fabrica.crearBluRay();
//        System.out.println(disco);
//        
//        disco = fabrica.crearCd();
//        System.out.println(disco);
//    }
    
//    /**
//     * @param args the command line arguments
//     */
    public static void main(String[] args) {
        edu.ubp.doo.modelo1.FabricaDisco fabricaDisco;
        edu.ubp.doo.modelo1.Disco disco;
        
        fabricaDisco = edu.ubp.doo.modelo1.Fabrica.crearFabrica("SIMPLE");
        disco = fabricaDisco.crearDvd();
        System.out.println(disco);
        
        disco = fabricaDisco.crearBluRay();
        System.out.println(disco);
        
        disco = fabricaDisco.crearCd();
        System.out.println(disco);
        
        fabricaDisco = edu.ubp.doo.modelo1.Fabrica.crearFabrica("DOBLE");
        disco = fabricaDisco.crearDvd();
        System.out.println(disco);
        
        disco = fabricaDisco.crearBluRay();
        System.out.println(disco);
        
        disco = fabricaDisco.crearCd();
        System.out.println(disco);
    }

}
