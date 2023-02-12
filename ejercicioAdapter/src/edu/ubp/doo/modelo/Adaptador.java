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
public class Adaptador implements IEnchufeEuropeo {

    public IEnchufeBritanico enchufe;

    public Adaptador(IEnchufeBritanico enchufe) {
        this.enchufe = enchufe;
    }

    @Override
    public int voltaje220V() {
        return this.enchufe.voltaje110V() * 2;
    }

    @Override
    public int cantidadPatas() {
        return this.enchufe.cantidadPatas() - 1;
    }

}
