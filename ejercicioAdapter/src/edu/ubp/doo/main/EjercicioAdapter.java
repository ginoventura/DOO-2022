/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubp.doo.main;

import edu.ubp.doo.modelo.Adaptador;
import edu.ubp.doo.modelo.EnchufeArgentino;
import edu.ubp.doo.modelo.EnchufeEEUU;
import edu.ubp.doo.modelo.IEnchufeBritanico;
import edu.ubp.doo.modelo.IEnchufeEuropeo;
import edu.ubp.doo.modelo.Licuadora;

/**
 *
 * @author agustin
 */
public class EjercicioAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Licuadora licu;
        //En Argentina
        System.out.println("Licuadora funcionando en directo: ");
        IEnchufeEuropeo enchufeA = new EnchufeArgentino();
        licu = new Licuadora(enchufeA);
        licu.encender();
        licu.apagar();

        //En EEUU
        System.out.println("Licuadora funcionando con adaptador: ");
        IEnchufeBritanico enchufeB = new EnchufeEEUU();
        IEnchufeEuropeo adaptador = new Adaptador(enchufeB);
        licu = new Licuadora(adaptador);
        licu.encender();
        licu.apagar();
    }

}
