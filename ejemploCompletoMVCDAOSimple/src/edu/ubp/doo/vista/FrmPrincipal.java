/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubp.doo.vista;

import edu.ubp.doo.controlador.Controlador;
import edu.ubp.doo.controlador.PrincipalControlador;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author agustin
 */
public class FrmPrincipal extends javax.swing.JFrame implements InterfazVista {

    private static FrmPrincipal instancia = null;
    private static final long serialVersionUID = 1L;
    private PrincipalControlador controlador;

    public static FrmPrincipal getInstancia() {
        if (instancia == null) {
            instancia = new FrmPrincipal();
        }
        return instancia;
    }

    /**
     * Creates new form FrmPrincipal
     */
    private FrmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mItemAlumnos = new javax.swing.JMenuItem();
        mItemMaterias = new javax.swing.JMenuItem();
        mItemInscripciones = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mItemAcerca = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setSize(new java.awt.Dimension(0, 0));

        jMenu1.setText("Gestión");
        jMenu1.setActionCommand("");

        mItemAlumnos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mItemAlumnos.setText("Alumnos");
        mItemAlumnos.setActionCommand("");
        mItemAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemAlumnosActionPerformed(evt);
            }
        });
        jMenu1.add(mItemAlumnos);

        mItemMaterias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mItemMaterias.setText("Materias");
        mItemMaterias.setActionCommand("ABMMATERIA");
        mItemMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemMateriasActionPerformed(evt);
            }
        });
        jMenu1.add(mItemMaterias);

        mItemInscripciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mItemInscripciones.setText("Inscripciones");
        mItemInscripciones.setActionCommand("");
        mItemInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemInscripcionesActionPerformed(evt);
            }
        });
        jMenu1.add(mItemInscripciones);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        mItemAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mItemAcerca.setText("Acerca de");
        jMenu2.add(mItemAcerca);
        jMenu2.add(jSeparator1);

        mItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mItemSalir.setText("Salir");
        mItemSalir.setActionCommand("SALIR");
        jMenu2.add(mItemSalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItemAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemAlumnosActionPerformed
        controlador.abmAlumno(controlador);
    }//GEN-LAST:event_mItemAlumnosActionPerformed

    private void mItemMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemMateriasActionPerformed
        controlador.abmMateria();
    }//GEN-LAST:event_mItemMateriasActionPerformed

    private void mItemInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemInscripcionesActionPerformed
        controlador.abmInscripcion();
    }//GEN-LAST:event_mItemInscripcionesActionPerformed

    @Override
    public void setControlador(Controlador c) {
        this.controlador = (PrincipalControlador) c;
    }

    @Override
    public void iniciaVista() {
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    @Override
    public void imprimeMensaje(Exception... e) {
        if(e.length>0){
            JOptionPane.showMessageDialog(this, "Error: " + e[0].getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(this, "Operación ejecutada con exito", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void limpiaVista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mItemAcerca;
    private javax.swing.JMenuItem mItemAlumnos;
    private javax.swing.JMenuItem mItemInscripciones;
    private javax.swing.JMenuItem mItemMaterias;
    private javax.swing.JMenuItem mItemSalir;
    // End of variables declaration//GEN-END:variables
}
