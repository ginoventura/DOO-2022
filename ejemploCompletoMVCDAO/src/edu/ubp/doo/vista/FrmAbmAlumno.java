package edu.ubp.doo.vista;

import edu.ubp.doo.controlador.Controlador;
import edu.ubp.doo.dto.MateriaDto;
import java.awt.event.ActionEvent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmAbmAlumno extends javax.swing.JDialog implements InterfazVistaAbm {

    private static final long serialVersionUID = 1L;

    private final DefaultTableModel modeloTblAlumnos;

    public FrmAbmAlumno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.modeloTblAlumnos = (DefaultTableModel) this.tblAlumnos.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUpEdicion = new javax.swing.JPopupMenu();
        mItemNuevoAlumno = new javax.swing.JMenuItem();
        mItemGuardarAlumno = new javax.swing.JMenuItem();
        mItemModificarAlumno = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mItemInscribirAlumno = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLegajo = new javax.swing.JFormattedTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btnEdicion = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        panelMateriasInscripcion = new javax.swing.JPanel();
        cmbMaterias = new javax.swing.JComboBox<>();
        lblTotalFilasTabla = new javax.swing.JLabel();

        mItemNuevoAlumno.setText("Nuevo");
        mItemNuevoAlumno.setActionCommand("LIMPIAR");
        popUpEdicion.add(mItemNuevoAlumno);

        mItemGuardarAlumno.setText("Guardar");
        mItemGuardarAlumno.setActionCommand("GUARDAR");
        mItemGuardarAlumno.setEnabled(false);
        popUpEdicion.add(mItemGuardarAlumno);

        mItemModificarAlumno.setText("Modificar");
        mItemModificarAlumno.setActionCommand("MODIFICAR");
        mItemModificarAlumno.setEnabled(false);
        popUpEdicion.add(mItemModificarAlumno);
        popUpEdicion.add(jSeparator1);

        mItemInscribirAlumno.setText("Inscribir");
        mItemInscribirAlumno.setActionCommand("INSCRIBIR");
        popUpEdicion.add(mItemInscribirAlumno);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alumnos");
        setResizable(false);

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Legajo", "Nombre", "Apellido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAlumnos);

        btnEliminar.setText("Eliminar Seleccion");
        btnEliminar.setActionCommand("ELIMINAR");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        jLabel1.setText("Legajo:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        try {
            txtLegajo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtLegajo.setEnabled(false);

        btnEdicion.setText("Edicion");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setActionCommand("LIMPIAR");

        panelMateriasInscripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(null));
        this.panelMateriasInscripcion.setEnabled(false);

        this.cmbMaterias.setEnabled(false);

        javax.swing.GroupLayout panelMateriasInscripcionLayout = new javax.swing.GroupLayout(panelMateriasInscripcion);
        panelMateriasInscripcion.setLayout(panelMateriasInscripcionLayout);
        panelMateriasInscripcionLayout.setHorizontalGroup(
            panelMateriasInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMateriasInscripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbMaterias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMateriasInscripcionLayout.setVerticalGroup(
            panelMateriasInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMateriasInscripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLegajo, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)))
                    .addComponent(panelMateriasInscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(btnEdicion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMateriasInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdicion)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        lblTotalFilasTabla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalFilasTabla.setText("Total filas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotalFilasTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotalFilasTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdicion;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<MateriaDto> cmbMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblTotalFilasTabla;
    private javax.swing.JMenuItem mItemGuardarAlumno;
    private javax.swing.JMenuItem mItemInscribirAlumno;
    private javax.swing.JMenuItem mItemModificarAlumno;
    private javax.swing.JMenuItem mItemNuevoAlumno;
    private javax.swing.JPanel panelMateriasInscripcion;
    private javax.swing.JPopupMenu popUpEdicion;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JFormattedTextField txtLegajo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    public DefaultTableModel getModeloTblAlumnos() {
        return modeloTblAlumnos;
    }

    @Override
    public void setControlador(Controlador c) {
        this.btnLimpiar.addActionListener(c);
        this.btnEliminar.addActionListener(c);
        this.btnEdicion.addMouseListener(c);
        this.mItemGuardarAlumno.addActionListener(c);
        this.mItemModificarAlumno.addActionListener(c);
        this.mItemNuevoAlumno.addActionListener(c);
        this.mItemInscribirAlumno.addActionListener(c);
        this.txtLegajo.addKeyListener(c);
        this.tblAlumnos.addMouseListener(c);
        c.actionPerformed(new ActionEvent(this, 0, InterfazVistaAbm.Operacion.CARGAR.toString()));
        this.lblTotalFilasTabla.setText("Total filas: " + this.modeloTblAlumnos.getRowCount());
    }

    @Override
    public void iniciaVista() {
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void imprimeMensaje(Exception... e) {
        if (e.length > 0) {
            JOptionPane.showMessageDialog(this, "Error: " + e[0].getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Operación ejecutada con exito", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void limpiaVista() {
        this.txtLegajo.setValue(null);
        this.txtApellido.setText("");
        this.txtNombre.setText("");
        this.tblAlumnos.clearSelection();
        this.panelMateriasInscripcion.setEnabled(false);
        this.cmbMaterias.setEnabled(false);
    }

    @Override
    public void actualizaTabla(Controlador c) {
        c.actionPerformed(new ActionEvent(this, 0, InterfazVistaAbm.Operacion.CARGAR.toString()));
        this.lblTotalFilasTabla.setText("Total filas: " + this.modeloTblAlumnos.getRowCount());
    }

    public javax.swing.JTable getTblAlumnos() {
        return tblAlumnos;
    }

    public void setTblAlumnos(javax.swing.JTable tblAlumnos) {
        this.tblAlumnos = tblAlumnos;
    }

    public javax.swing.JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(javax.swing.JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public javax.swing.JFormattedTextField getTxtLegajo() {
        return txtLegajo;
    }

    public void setTxtLegajo(javax.swing.JFormattedTextField txtLegajo) {
        this.txtLegajo = txtLegajo;
    }

    public javax.swing.JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(javax.swing.JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public javax.swing.JPopupMenu getPopUpEdicion() {
        return popUpEdicion;
    }

    public void setPopUpEdicion(javax.swing.JPopupMenu popUpEdicion) {
        this.popUpEdicion = popUpEdicion;
    }

    public javax.swing.JMenuItem getmItemModificarAlumno() {
        return mItemModificarAlumno;
    }

    public void setmItemModificarAlumno(javax.swing.JMenuItem mItemModificarAlumno) {
        this.mItemModificarAlumno = mItemModificarAlumno;
    }

    public javax.swing.JMenuItem getmItemGuardarAlumno() {
        return mItemGuardarAlumno;
    }

    public void setmItemGuardarAlumno(javax.swing.JMenuItem mItemGuardarAlumno) {
        this.mItemGuardarAlumno = mItemGuardarAlumno;
    }

    public javax.swing.JMenuItem getmItemInscribirAlumno() {
        return mItemInscribirAlumno;
    }

    public void setmItemInscribirAlumno(javax.swing.JMenuItem mItemInscribirAlumno) {
        this.mItemInscribirAlumno = mItemInscribirAlumno;
    }

    public javax.swing.JComboBox<MateriaDto> getCmbMaterias() {
        return cmbMaterias;
    }

    public void setCmbMaterias(javax.swing.JComboBox<MateriaDto> cmbMaterias) {
        this.cmbMaterias = cmbMaterias;
    }

    public javax.swing.JPanel getPanelMateriasInscripcion() {
        return panelMateriasInscripcion;
    }

    public void setPanelMateriasInscripcion(javax.swing.JPanel panelMateriasInscripcion) {
        this.panelMateriasInscripcion = panelMateriasInscripcion;
    }


}
