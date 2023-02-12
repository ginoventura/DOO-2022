/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubp.doo.controlador;

import edu.ubp.doo.dto.MateriaDto;
import edu.ubp.doo.modelo.Materia;
import edu.ubp.doo.modelo.Modelo;
import edu.ubp.doo.vista.FrmAbmMateria;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import edu.ubp.doo.vista.InterfazVistaAbm;
import java.awt.event.FocusEvent;

/**
 *
 * @author agustin
 */
public class MateriaControlador extends Controlador {

    public MateriaControlador(InterfazVistaAbm vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultTableModel modeloTabla = (DefaultTableModel) ((FrmAbmMateria) this.VISTA).getModeloTbl();
        boolean resultado = false;
        String nombre;
        String descripcion;
        MateriaDto mat;
        try {

            switch (InterfazVistaAbm.Operacion.valueOf(e.getActionCommand())) {
                case CARGAR:
                    modeloTabla.setRowCount(0);
                    modeloTabla.fireTableDataChanged();
                    List<MateriaDto> listadoMaterias = ((Materia) this.MODELO).listar();
                    for (MateriaDto alu : listadoMaterias) {
                        modeloTabla.addRow(new Object[]{alu.getIdMateria(), alu.getNombre(), alu.getDescripcion()});
                    }
                    break;
                case GUARDAR:
                    nombre = ((FrmAbmMateria) this.VISTA).getTxtNombre().getText();
                    descripcion = ((FrmAbmMateria) this.VISTA).getTxtDescripcion().getText();
                    if (!nombre.equals("") && !descripcion.equals("")) {
                        resultado = ((Materia) this.MODELO).guardar(nombre.toUpperCase(), descripcion.toUpperCase());
                        if (resultado) {
                            ((InterfazVistaAbm)VISTA).actualizaTabla(this);
                        }
                        VISTA.limpiaVista();
                    } else {
                        VISTA.imprimeMensaje(new Exception("Todos los campos son obligatorios"));
                    }
                    break;
                case MODIFICAR:
                    int idAnterior = Integer.parseInt(modeloTabla.getValueAt(((FrmAbmMateria) this.VISTA).getTblMaterias().getSelectedRow(), 0).toString());
                    nombre = ((FrmAbmMateria) this.VISTA).getTxtNombre().getText();
                    descripcion = ((FrmAbmMateria) this.VISTA).getTxtDescripcion().getText();
                    if (!nombre.equals("") && !descripcion.equals("")) {
                        resultado = ((Materia) this.MODELO).modificar(idAnterior, nombre.toUpperCase(), descripcion.toUpperCase());
                        if (resultado) {
                            ((InterfazVistaAbm)VISTA).actualizaTabla(this);
                        }
                        VISTA.limpiaVista();
                    } else {
                        VISTA.imprimeMensaje(new Exception("Todos los campos son obligatorios"));
                    }
                    break;
                case ELIMINAR:
                    if(((FrmAbmMateria) this.VISTA).getTblMaterias().getSelectedRow() == -1) {
                        VISTA.imprimeMensaje(new Exception("Debe seleccionar una fila"));
                        return;
                    }
                    int respuesta = JOptionPane.showConfirmDialog(((FrmAbmMateria) this.VISTA), "¿Seguro desea eliminar esa materia?", "Información", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (respuesta == JOptionPane.OK_OPTION) {
                        int id = Integer.parseInt(modeloTabla.getValueAt(((FrmAbmMateria) this.VISTA).getTblMaterias().getSelectedRow(), 0).toString());
                        resultado = ((Materia) this.MODELO).borrar(id);
                        if (resultado) {
                            ((InterfazVistaAbm)VISTA).actualizaTabla(this);
                        } else {
                            VISTA.imprimeMensaje(new Exception("Ocurrio un error al eliminar la materia"));
                        }
                        VISTA.limpiaVista();
                    }
                    break;
                case LIMPIAR:
                    ((FrmAbmMateria) this.VISTA).limpiaVista();
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
            DefaultTableModel modeloTabla = (DefaultTableModel) ((FrmAbmMateria) this.VISTA).getModeloTbl();
            ((FrmAbmMateria) this.VISTA).getTxtId().setValue(modeloTabla.getValueAt(((FrmAbmMateria) this.VISTA).getTblMaterias().getSelectedRow(), 0));
            ((FrmAbmMateria) this.VISTA).getTxtNombre().setText((String) modeloTabla.getValueAt(((FrmAbmMateria) this.VISTA).getTblMaterias().getSelectedRow(), 1));
            ((FrmAbmMateria) this.VISTA).getTxtDescripcion().setText((String) modeloTabla.getValueAt(((FrmAbmMateria) this.VISTA).getTblMaterias().getSelectedRow(), 2));
        } else if(e.getSource() instanceof JButton){
            Object id = ((FrmAbmMateria) this.VISTA).getTxtId().getValue();
            if (id != null) {
                ((FrmAbmMateria) this.VISTA).getmItemGuardar().setEnabled(false);
                ((FrmAbmMateria) this.VISTA).getmItemModificar().setEnabled(true);
            } else {
                ((FrmAbmMateria) this.VISTA).getmItemGuardar().setEnabled(true);
                ((FrmAbmMateria) this.VISTA).getmItemModificar().setEnabled(false);
            }
            ((FrmAbmMateria) this.VISTA).getPopUpEdicion().show(e.getComponent(), e.getX(), e.getY());
        }
    }

    
}
