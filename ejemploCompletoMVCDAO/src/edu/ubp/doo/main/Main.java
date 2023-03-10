package edu.ubp.doo.main;

import com.formdev.flatlaf.FlatLightLaf;
import edu.ubp.doo.controlador.AlumnoControlador;
import edu.ubp.doo.controlador.Controlador;
import edu.ubp.doo.controlador.PrincipalControlador;
import edu.ubp.doo.modelo.Alumno;
import edu.ubp.doo.modelo.Modelo;
import edu.ubp.doo.vista.FrmAbmAlumno;
import edu.ubp.doo.vista.FrmPrincipal;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import edu.ubp.doo.vista.InterfazVistaAbm;
import edu.ubp.doo.vista.InterfazVistaPrincipal;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatLightLaf());
                } catch (UnsupportedLookAndFeelException ex) {
                    System.err.println("Failed to initialize LaF");
                }
                //modelo:
                Modelo modelo = new Alumno();
                //vista:
                InterfazVistaPrincipal vista = FrmPrincipal.getInstancia();

                //controlador:
                Controlador control = new PrincipalControlador(vista, null);

                //configuramos la vista para que pueda enviar las acciones del usuario como eventos al controlador
                vista.setControlador(control);

                //y arrancamos la interfaz:
                vista.iniciaVista();
            }
        });
    }
}
