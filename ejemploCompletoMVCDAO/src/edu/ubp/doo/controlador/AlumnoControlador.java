/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubp.doo.controlador;

import edu.ubp.doo.dto.AlumnoDto;
import edu.ubp.doo.dto.MateriaDto;
import edu.ubp.doo.modelo.Alumno;
import edu.ubp.doo.modelo.Modelo;
import edu.ubp.doo.vista.FrmAbmAlumno;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import edu.ubp.doo.vista.InterfazVistaAbm;

/**
 *
 * @author agustin
 */
public class AlumnoControlador extends Controlador {

    Controlador ctrlInscripcion;

    public AlumnoControlador(InterfazVistaAbm vista, Modelo modelo, Controlador ctrlInscripcion) {
        VISTA = vista;
        MODELO = modelo;
        this.ctrlInscripcion = ctrlInscripcion;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultTableModel modeloTabla = (DefaultTableModel) ((FrmAbmAlumno) this.VISTA).getModeloTblAlumnos();
        boolean resultado = false;
        String nombre;
        String apellido;
        AlumnoDto alum;
        int respuesta;
        try {

            switch (InterfazVistaAbm.Operacion.valueOf(e.getActionCommand())) {
                case CARGAR:
                    modeloTabla.setRowCount(0);
                    modeloTabla.fireTableDataChanged();
                    List<AlumnoDto> listadoAlumnos = ((Alumno) this.MODELO).listar();
                    for (AlumnoDto alu : listadoAlumnos) {
                        modeloTabla.addRow(new Object[]{alu.getLegajo(), alu.getNombre(), alu.getApellido()});
                    }
                    break;
                case GUARDAR:
                    nombre = ((FrmAbmAlumno) this.VISTA).getTxtNombre().getText();
                    apellido = ((FrmAbmAlumno) this.VISTA).getTxtApellido().getText();
                    if (!nombre.equals("") && !apellido.equals("")) {
                        resultado = ((Alumno) this.MODELO).guardar(apellido.toUpperCase(), nombre.toUpperCase(), new Date(System.currentTimeMillis()), "");
                        if (resultado) {
                            ((InterfazVistaAbm) VISTA).actualizaTabla(this);
                        }
                        VISTA.limpiaVista();
                    } else {
                        VISTA.imprimeMensaje(new Exception("Todos los campos son obligatorios"));
                    }
                    break;
                case MODIFICAR:
                    int legAnterior = Integer.parseInt(modeloTabla.getValueAt(((FrmAbmAlumno) this.VISTA).getTblAlumnos().getSelectedRow(), 0).toString());
                    nombre = ((FrmAbmAlumno) this.VISTA).getTxtNombre().getText();
                    apellido = ((FrmAbmAlumno) this.VISTA).getTxtApellido().getText();
                    if (!nombre.equals("") && !apellido.equals("")) {
                        resultado = ((Alumno) this.MODELO).modificar(legAnterior, apellido.toUpperCase(), nombre.toUpperCase(), new Date(System.currentTimeMillis()), "");
                        if (resultado) {
                            ((InterfazVistaAbm) VISTA).actualizaTabla(this);
                        }
                        VISTA.limpiaVista();
                    } else {
                        VISTA.imprimeMensaje(new Exception("Todos los campos son obligatorios"));
                    }
                    break;
                case ELIMINAR:
                    if (((FrmAbmAlumno) this.VISTA).getTblAlumnos().getSelectedRow() == -1) {
                        VISTA.imprimeMensaje(new Exception("Debe seleccionar una fila"));
                        return;
                    }
                    respuesta = JOptionPane.showConfirmDialog(((FrmAbmAlumno) this.VISTA), "¿Seguro desea eliminar ese alumno?", "Información", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (respuesta == JOptionPane.OK_OPTION) {
                        int legajo = Integer.parseInt(modeloTabla.getValueAt(((FrmAbmAlumno) this.VISTA).getTblAlumnos().getSelectedRow(), 0).toString());
                        resultado = ((Alumno) this.MODELO).borrar(legajo);
                        if (resultado) {
                            ((InterfazVistaAbm) VISTA).actualizaTabla(this);
                        } else {
                            VISTA.imprimeMensaje(new Exception("Ocurrio un error al eliminar el alumno, es probable que tenga inscripciones asociadas"));
                        }
                        VISTA.limpiaVista();
                    }
                    break;
                case LIMPIAR:
                    ((FrmAbmAlumno) this.VISTA).limpiaVista();
                    break;
                case INSCRIBIR:
                    respuesta = JOptionPane.showConfirmDialog(((FrmAbmAlumno) this.VISTA), "¿Seguro desea inscribir al alumno en " + ((FrmAbmAlumno) this.VISTA).getCmbMaterias().getSelectedItem().toString() + "?", "Información", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (respuesta == JOptionPane.OK_OPTION) {
                        int idMateria = ((MateriaDto) ((FrmAbmAlumno) this.VISTA).getCmbMaterias().getSelectedItem()).getIdMateria();
                        int legajo = Integer.parseInt(modeloTabla.getValueAt(((FrmAbmAlumno) this.VISTA).getTblAlumnos().getSelectedRow(), 0).toString());
                        boolean resp = ((Alumno) this.MODELO).guardarInscripcion(legajo, idMateria, new Date(System.currentTimeMillis()), "");
                        if (resp) {
                            VISTA.imprimeMensaje();
                            if (ctrlInscripcion != null) {
                                this.ctrlInscripcion.actionPerformed(new ActionEvent(this, 0, InterfazVistaAbm.Operacion.CARGAR.toString()));
                            }
                        }
                        VISTA.limpiaVista();
                    }
                    break;
            }
        } catch (RuntimeException ex) {
            VISTA.imprimeMensaje(ex);
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
        verificarInputTxt(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        verificarInputTxt(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        verificarInputTxt(e);
    }

    public void verificarInputTxt(KeyEvent e) {
        char c = e.getKeyChar();

        if (!((c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)
                || (c == KeyEvent.VK_ENTER) || (c == KeyEvent.VK_TAB)
                || (Character.isDigit(c)))) {
            e.consume();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() instanceof JTable) {
            DefaultTableModel modeloTabla = (DefaultTableModel) ((FrmAbmAlumno) this.VISTA).getModeloTblAlumnos();
            Integer legajo = (Integer) modeloTabla.getValueAt(((FrmAbmAlumno) this.VISTA).getTblAlumnos().getSelectedRow(), 0);
            ((FrmAbmAlumno) this.VISTA).getTxtLegajo().setValue(legajo.toString());
            ((FrmAbmAlumno) this.VISTA).getTxtNombre().setText((String) modeloTabla.getValueAt(((FrmAbmAlumno) this.VISTA).getTblAlumnos().getSelectedRow(), 1));
            ((FrmAbmAlumno) this.VISTA).getTxtApellido().setText((String) modeloTabla.getValueAt(((FrmAbmAlumno) this.VISTA).getTblAlumnos().getSelectedRow(), 2));
            ((FrmAbmAlumno) this.VISTA).getCmbMaterias().removeAllItems();
            List<MateriaDto> listadoMaterias = ((Alumno) this.MODELO).listarMateriasDisponibles(legajo);
            for (MateriaDto mat : listadoMaterias) {
                ((FrmAbmAlumno) this.VISTA).getCmbMaterias().addItem(mat);
            }
            ((FrmAbmAlumno) this.VISTA).getCmbMaterias().setEnabled(false);
            ((FrmAbmAlumno) this.VISTA).getPanelMateriasInscripcion().setEnabled(false);
            if (((FrmAbmAlumno) this.VISTA).getCmbMaterias().getItemCount() > 0) {
                ((FrmAbmAlumno) this.VISTA).getCmbMaterias().setEnabled(true);
                ((FrmAbmAlumno) this.VISTA).getPanelMateriasInscripcion().setEnabled(true);
            }
        } else if (e.getSource() instanceof JButton) {
            Object legajo = ((FrmAbmAlumno) this.VISTA).getTxtLegajo().getValue();
            if (legajo != null) {
                ((FrmAbmAlumno) this.VISTA).getmItemGuardarAlumno().setEnabled(false);
                ((FrmAbmAlumno) this.VISTA).getmItemModificarAlumno().setEnabled(true);
            } else {
                ((FrmAbmAlumno) this.VISTA).getmItemGuardarAlumno().setEnabled(true);
                ((FrmAbmAlumno) this.VISTA).getmItemModificarAlumno().setEnabled(false);
            }
            ((FrmAbmAlumno) this.VISTA).getmItemInscribirAlumno().setEnabled(false);
            if (((FrmAbmAlumno) this.VISTA).getCmbMaterias().getItemCount() > 0) {
                ((FrmAbmAlumno) this.VISTA).getmItemInscribirAlumno().setEnabled(true);
            }
            ((FrmAbmAlumno) this.VISTA).getPopUpEdicion().show(e.getComponent(), e.getX(), e.getY());
        }
    }

}
