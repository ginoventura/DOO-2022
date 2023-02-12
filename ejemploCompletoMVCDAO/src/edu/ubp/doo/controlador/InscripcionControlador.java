/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubp.doo.controlador;

import edu.ubp.doo.dto.InscripcionDto;
import edu.ubp.doo.modelo.Inscripcion;
import edu.ubp.doo.modelo.Modelo;
import edu.ubp.doo.vista.FrmAbmInscripcion;
import edu.ubp.doo.vista.InterfazVistaAbm;
import edu.ubp.doo.vista.InterfazVistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author agustin
 */
public class InscripcionControlador extends Controlador {

    Controlador principalCtrl;
    InterfazVistaPrincipal vistaPrincipal;

    public InscripcionControlador(InterfazVistaAbm vista, Modelo modelo, Controlador principal, InterfazVistaPrincipal vistaPrincipal) {
        VISTA = vista;
        MODELO = modelo;
        this.principalCtrl = principal;
        this.vistaPrincipal = vistaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultTableModel modeloTabla = (DefaultTableModel) ((FrmAbmInscripcion) this.VISTA).getModeloTbl();
        boolean resultado = false;
        try {

            switch (InterfazVistaAbm.Operacion.valueOf(e.getActionCommand())) {
                case CARGAR:
                    cargarTabla(modeloTabla);
                    ((FrmAbmInscripcion) VISTA).getLblTotalFilasTabla().setText("Total filas: " + modeloTabla.getRowCount());
                    break;
                case GUARDAR:
                    break;
                case MODIFICAR:
                    break;
                case ELIMINAR:
                    if (((FrmAbmInscripcion) this.VISTA).getTblInscripciones().getSelectedRow() == -1) {
                        VISTA.imprimeMensaje(new Exception("Debe seleccionar una fila"));
                        return;
                    }
                    int respuesta = JOptionPane.showConfirmDialog(((FrmAbmInscripcion) this.VISTA), "¿Seguro desea eliminar esa materia?", "Información", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (respuesta == JOptionPane.OK_OPTION) {
                        int id = Integer.parseInt(modeloTabla.getValueAt(((FrmAbmInscripcion) this.VISTA).getTblInscripciones().getSelectedRow(), 0).toString());
                        resultado = ((Inscripcion) this.MODELO).borrar(id);
                        if (resultado) {
                            ((InterfazVistaAbm) VISTA).actualizaTabla(this);
                        } else {
                            VISTA.imprimeMensaje(new Exception("Ocurrio un error al eliminar la inscripción"));
                        }
                        VISTA.limpiaVista();
                    }
                    break;
                case INSCRIBIR:
                    this.principalCtrl.actionPerformed(new ActionEvent(this, 0, InterfazVistaPrincipal.Operacion.ABMALUMNO.toString()));
                    break;
                case LIMPIAR:
                    ((FrmAbmInscripcion) this.VISTA).limpiaVista();
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

    }

    private void cargarTabla(DefaultTableModel modeloTabla) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<InscripcionDto> listadoInscripciones = ((Inscripcion) this.MODELO).listar();
        for (InscripcionDto ins : listadoInscripciones) {
            modeloTabla.addRow(new Object[]{ins.getIdInscripcion(), new SimpleDateFormat("dd-MM-yyyy").format(ins.getFecha()), ins.getAlumno().toString(), ins.getMateria().toString()});
        }
    }

}
