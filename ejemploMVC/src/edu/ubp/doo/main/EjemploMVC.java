
package edu.ubp.doo.main;

import edu.ubp.doo.controlador.Controlador;
import edu.ubp.doo.controlador.ControladorImpl;
import edu.ubp.doo.modelo.Modelo;
import edu.ubp.doo.vista.CalculadoraJFrame;
import edu.ubp.doo.vista.CalculadoraVistaTextual;
import edu.ubp.doo.vista.InterfazVista;
import javax.swing.SwingUtilities;

public class EjemploMVC {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //modelo:
                Modelo modelo = new Modelo();
                //vista:
                InterfazVista vista = new CalculadoraVistaTextual();
                //InterfazVista vista = new CalculadoraJFrame();

                //controlador:
                Controlador control = new ControladorImpl(vista, modelo);

                //configuramos la vista para que pueda enviar las acciones del usuario como eventos al controlador
                vista.setControlador(control);

                //y arrancamos la interfaz:
                vista.iniciaVista();
            }
        });

    }

}
