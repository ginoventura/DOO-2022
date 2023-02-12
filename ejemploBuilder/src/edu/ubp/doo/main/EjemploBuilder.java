/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubp.doo.main;

import edu.ubp.doo.modelo.Alumno;
import edu.ubp.doo.modelo.Alumno.Builder;

/**
 *
 * @author agustin
 */
public class EjemploBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        Builder builder = new Alumno.Builder("Agustin", "Fernandez", "40853/1").conEmail("agus@gmail.com").conCelular("152366489").conNotif(true);
//        Alumno a1 = builder.build();
//        System.out.println("Cta1: " + a1);
//        Alumno a2 = builder.conCelular("153626699").build();
//        System.out.println("Cta2: " + a2);
//        
        Alumno a3 = new Alumno.Builder("Agustin", "Fernandez", "40853/1").conEmail("agus@gmail.com").build();
        Alumno a4 = new Alumno.Builder("Agustin", "Fernandez", "40853/1").conEmail("agus@gmail.com").conCelular("153467841").build();
        System.out.println("Cta3: " + a3);
        System.out.println("Cta4: " + a4);
    }

}
