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
public class EnchufeEEUU implements IEnchufeBritanico{

    @Override
    public int voltaje110V() {
        return 110;
    }

    @Override
    public int cantidadPatas() {
        return 3;
    }
    
}
