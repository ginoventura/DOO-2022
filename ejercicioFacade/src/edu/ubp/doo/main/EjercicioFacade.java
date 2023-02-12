/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ubp.doo.main;

import edu.ubp.doo.modelo.FachadaFIB;

/**
 *
 * @author agustin
 */
public class EjercicioFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FachadaFIB fachada = new FachadaFIB(55, 27717209);
        
        System.out.printf("Es apto para credito: %b \n",fachada.verificarAptoCredito());
        
        
    }
    
}
