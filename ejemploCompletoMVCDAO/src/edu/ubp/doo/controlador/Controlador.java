
package edu.ubp.doo.controlador;

import edu.ubp.doo.modelo.Modelo;
import edu.ubp.doo.vista.InterfazVista;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;

public abstract class Controlador extends MouseAdapter implements ActionListener, KeyListener {
    InterfazVista VISTA = null;
    Modelo MODELO = null;
}
