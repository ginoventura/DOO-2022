
package edu.ubp.doo.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import edu.ubp.doo.modelo.Modelo;
import edu.ubp.doo.vista.InterfazVista;
import java.awt.event.ItemEvent;

public class ControladorImpl extends Controlador {

    public ControladorImpl(InterfazVista vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int numero1 = VISTA.tomarNumero1();
            int numero2 = VISTA.tomarNumero2();
            MODELO.setNumero1(numero1);
            MODELO.setNumero2(numero2);
            int resultado = 0;

            switch (InterfazVista.Operacion.valueOf(e.getActionCommand())) {
                case SUMAR:
                    resultado = MODELO.sumar();
                    VISTA.imprimeResultado(resultado);
                    break;
                case RESTAR:
                    resultado = MODELO.restar();
                    VISTA.imprimeResultado(resultado);
                    break;
                case MULTIPLICAR:
                    resultado = MODELO.multiplicar();
                    VISTA.imprimeResultado(resultado);
                    break;
                case DIVIDIR:
                    resultado = MODELO.dividir();
                    VISTA.imprimeResultado(resultado);
                    break;    
            }
        } catch (Exception ex) {
            VISTA.imprimeError(ex);
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
    public void itemStateChanged(ItemEvent ie) {
        if (ie.getStateChange() == ItemEvent.SELECTED) {
            Object item = ie.getItem();
            System.out.println(item);
        }
    }

}
