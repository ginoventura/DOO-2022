/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubp.doo.controlador;

import edu.ubp.doo.modelo.Alumno;
import edu.ubp.doo.modelo.Inscripcion;
import edu.ubp.doo.modelo.Materia;
import edu.ubp.doo.modelo.Modelo;
import edu.ubp.doo.vista.FrmAbmAlumno;
import edu.ubp.doo.vista.FrmAbmMateria;
import edu.ubp.doo.vista.FrmAbmInscripcion;
import edu.ubp.doo.vista.InterfazVistaAbm;
import edu.ubp.doo.vista.InterfazVistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author agustin
 */
public class PrincipalControlador extends Controlador {

    public PrincipalControlador(InterfazVistaPrincipal vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        InterfazVistaAbm vista;
        Controlador control;
        try {

            switch (InterfazVistaPrincipal.Operacion.valueOf(e.getActionCommand())) {
                case ABMALUMNO:
                    InscripcionControlador inscCtrl = null;
                    if (e.getSource() instanceof InscripcionControlador) {
                        inscCtrl = (InscripcionControlador) e.getSource();
                    }
                    //modelo:
                    this.MODELO = new Alumno();
                    //vista:
                    vista = new FrmAbmAlumno(null, true);

                    //controlador:
                    control = new AlumnoControlador(vista, this.MODELO, inscCtrl);

                    //configuramos la vista para que pueda enviar las acciones del usuario como eventos al controlador
                    vista.setControlador(control);

                    //y arrancamos la interfaz:
                    vista.iniciaVista();
                    break;
                case ABMMATERIA:
                    //modelo:
                    this.MODELO = new Materia();
                    //vista:
                    vista = new FrmAbmMateria(null, true);

                    //controlador:
                    control = new MateriaControlador(vista, this.MODELO);

                    //configuramos la vista para que pueda enviar las acciones del usuario como eventos al controlador
                    vista.setControlador(control);

                    //y arrancamos la interfaz:
                    vista.iniciaVista();
                    break;
                case ABMINSCRIPCION:
                    //modelo:
                    this.MODELO = new Inscripcion();
                    //vista:
                    vista = new FrmAbmInscripcion(null, true);

                    //controlador:
                    control = new InscripcionControlador(vista, this.MODELO, this, (InterfazVistaPrincipal) this.VISTA);

                    //configuramos la vista para que pueda enviar las acciones del usuario como eventos al controlador
                    vista.setControlador(control);

                    //y arrancamos la interfaz:
                    vista.iniciaVista();
                    break;
                case SALIR:
                    System.exit(0);
                    break;
            }
        } catch (RuntimeException ex) {
            VISTA.imprimeMensaje(ex);
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {

    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }


}
