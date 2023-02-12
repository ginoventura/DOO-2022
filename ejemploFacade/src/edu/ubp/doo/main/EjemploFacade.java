/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ubp.doo.main;

import edu.ubp.doo.modelo.Acelerador;
import edu.ubp.doo.modelo.CentralinaFachada;
import edu.ubp.doo.modelo.Embrague;
import edu.ubp.doo.modelo.IAcelerador;
import edu.ubp.doo.modelo.IEmbrague;
import edu.ubp.doo.modelo.IPalancaCambios;
import edu.ubp.doo.modelo.PalancaCambios;

/**
 *
 * @author agustin
 */
public class EjemploFacade {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        IAcelerador acelerador = new Acelerador();
        IEmbrague embrague = new Embrague();
        IPalancaCambios palancaCambios = new PalancaCambios();
        
        //Pasos necesarios para usar cada subsistemas en caso de 
        //que los cambios sean manuales.
        acelerador.soltarAcelerador();
        embrague.apretarEmbrague();
        palancaCambios.pasarPuntoMuerto();
        palancaCambios.cambiarVelocidad(1);
        embrague.soltarEmbrague();
        acelerador.apretarAcelerador();
        
        Thread.sleep(1000);
        
        //Pasando a 3ra velocidad (Si resiste el motor y la caja!!)
        acelerador.soltarAcelerador();
        embrague.apretarEmbrague();
        palancaCambios.pasarPuntoMuerto();
        palancaCambios.cambiarVelocidad(3);
        embrague.soltarEmbrague();
        acelerador.apretarAcelerador();
        
        Thread.sleep(1000);
        
        //Volviendo 1ra velocidad
        acelerador.soltarAcelerador();
        embrague.apretarEmbrague();
        palancaCambios.pasarPuntoMuerto();
        palancaCambios.cambiarVelocidad(1);
        embrague.soltarEmbrague();
        acelerador.apretarAcelerador(); 
        
        Thread.sleep(1000);
        
        System.err.println("Usando La Fachada");
        System.err.println("-----------------");
        System.err.println("-----------------");
        //Ahora usando la Centralina electrónica para simular una caja de cambios automatica secuencial
        CentralinaFachada centralina = new CentralinaFachada(acelerador, embrague, palancaCambios);
        centralina.aumentarVelocidad();
        centralina.reducirVelocidad();        
    }
    
}
