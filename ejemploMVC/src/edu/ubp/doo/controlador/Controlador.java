
package edu.ubp.doo.controlador;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import edu.ubp.doo.modelo.Modelo;
import edu.ubp.doo.vista.InterfazVista;
import java.awt.event.ItemListener;

public abstract class Controlador implements ActionListener, KeyListener, ItemListener{
    InterfazVista VISTA = null;
    Modelo MODELO = null;
    
    
}
