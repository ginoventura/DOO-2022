/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubp.doo.vista;

import edu.ubp.doo.controlador.Controlador;
import javax.swing.JDialog;

/**
 *
 * @author agustin
 */
public interface InterfazVistaAbm extends InterfazVista {

    public static enum Operacion {
        CARGAR, GUARDAR, MODIFICAR, ELIMINAR, LIMPIAR, INSCRIBIR;
    };
    
    void actualizaTabla(Controlador c);

}
