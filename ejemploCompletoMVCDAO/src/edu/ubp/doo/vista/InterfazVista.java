/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubp.doo.vista;

import edu.ubp.doo.controlador.Controlador;

/**
 *
 * @author agustin
 */
public interface InterfazVista {

    void setControlador(Controlador c);

    void iniciaVista();

    void imprimeMensaje(Exception... e);
    
    void limpiaVista();

}
