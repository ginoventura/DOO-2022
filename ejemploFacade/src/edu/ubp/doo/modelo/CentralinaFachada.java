/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ubp.doo.modelo;

/**
 *
 * @author agustin
 */
public class CentralinaFachada {
    
    IAcelerador acelerador;
    IEmbrague embrague;
    IPalancaCambios palancaCambios;
    int velocidadActual;
    
    public CentralinaFachada(IAcelerador acelerador, IEmbrague embrague, IPalancaCambios palancaCambios) {
        this.acelerador = acelerador;
        this.embrague = embrague;
        this.palancaCambios = palancaCambios;
        this.velocidadActual = 0;
    }
    
    public void aumentarVelocidad() {
        acelerador.soltarAcelerador();
        embrague.apretarEmbrague();
        this.velocidadActual = this.palancaCambios.getVelocidadActual();
        palancaCambios.pasarPuntoMuerto();
        if (this.velocidadActual < 5) {
            this.palancaCambios.cambiarVelocidad(this.velocidadActual + 1);
        }
        embrague.soltarEmbrague();
        acelerador.apretarAcelerador();
    }
    
    public void reducirVelocidad() {
        acelerador.soltarAcelerador();
        embrague.apretarEmbrague();
        this.velocidadActual = this.palancaCambios.getVelocidadActual();
        palancaCambios.pasarPuntoMuerto();
        if (this.velocidadActual > 1) {
            this.palancaCambios.cambiarVelocidad(this.velocidadActual - 1);
        }
        embrague.soltarEmbrague();
        acelerador.apretarAcelerador();
    }
    
}
