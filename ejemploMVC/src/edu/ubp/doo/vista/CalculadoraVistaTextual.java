/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubp.doo.vista;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import edu.ubp.doo.controlador.Controlador;

/**
 *
 * @author agustin
 */
public class CalculadoraVistaTextual implements InterfazVista {

    private Controlador controlador;
    // Gestión de la entrada por teclado
    private final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private int numero1;
    private int numero2;

    @Override
    public void setControlador(Controlador c) {
        this.controlador = c;
    }

    @Override
    public void iniciaVista() {
        imprimeMenu();
    }

    @Override
    public int tomarNumero1() {
        return this.numero1;
    }

    @Override
    public int tomarNumero2() {
        return this.numero2;
    }

    @Override
    public void imprimeResultado(int resultado) {
        System.out.println("Resultado de la operación: " + resultado);
    }

    @Override
    public void imprimeError(Exception e) {
        System.err.println("Ocurrio una Excepción: " + e.getMessage());
    }

    private void imprimeMenu() {
        System.out.println("Indica la operación que quiere realizar:");
        System.out.println("1: Sumar 2 números");
        System.out.println("2: Restar 2 números");
        System.out.println("3: Multiplicar 2 números");
        System.out.println("4: Dividir 2 números");
        System.out.println("-1: salir");

        int operacion;
        operacion = leeTeclado();
        while (operacion != -1) {
            switch (operacion) {
                case 1:
                    solicitaNros();
                    if (this.numero1 != -1 && this.numero2 != -1) {
                        controlador.actionPerformed(new ActionEvent(this, operacion, InterfazVista.Operacion.SUMAR.toString()));
                    } else {
                        System.out.println("Por favor ingrese  números válidos");
                    }
                    break;
                case 2:
                    solicitaNros();
                    if (this.numero1 != -1 && this.numero2 != -1) {
                        controlador.actionPerformed(new ActionEvent(this, operacion, InterfazVista.Operacion.RESTAR.toString()));
                    } else {
                        System.out.println("Por favor ingrese  números válidos");
                    }
                    break;
                case 3:
                    solicitaNros();
                    if (this.numero1 != -1 && this.numero2 != -1) {
                        controlador.actionPerformed(new ActionEvent(this, operacion, InterfazVista.Operacion.MULTIPLICAR.toString()));
                    } else {
                        System.out.println("Por favor ingrese  números válidos");
                    }
                    break;
                case 4:
                    solicitaNros();
                    if (this.numero1 != -1 && this.numero2 != -1) {
                        controlador.actionPerformed(new ActionEvent(this, operacion, InterfazVista.Operacion.DIVIDIR.toString()));
                    } else {
                        System.out.println("Por favor ingrese  números válidos");
                    }
                    break;
                default:
                    System.err.println("Esa no es una opción del menu");
            }
            muestraOpciones();
            operacion = leeTeclado();
        }
        System.out.println("Chau!!");
        System.exit(0);
    }
    
    private void muestraOpciones() {
        System.out.println("\nIndica la operación que quiere realizar:");
        System.out.println("1: Sumar 2 números");
        System.out.println("2: Restar 2 números");
        System.out.println("3: Multiplicar 2 números");
        System.out.println("4: Dividir 2 números");
        System.out.println("-1: salir");
    }

    private void solicitaNros() {
        System.out.println("Por favor ingrese el 1er número: ");
        this.numero1 = leeTeclado();
        System.out.println("Por favor ingrese el 2do número: ");
        this.numero2 = leeTeclado();
    }

    private int leeTeclado() {
        String s = null;
        try {
            s = in.readLine();
            return Integer.parseInt(s);
        } catch (IOException | NumberFormatException e) {
            return -1;
        }
    }

}
