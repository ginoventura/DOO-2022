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
public class Alumno {

    String nombre;
    String apellido;
    String legajo;
    String email;
    String celular;
    boolean recibeNotificaciones;

    public Alumno(Builder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.legajo = builder.legajo;
        this.email = builder.email;
        this.celular = builder.celular;
        this.recibeNotificaciones = builder.recibeNotificaciones;
    }

    @Override
    public String toString() {
        return "CuentaAlumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", legajo=" + legajo + ", email=" + email + ", celular=" + celular + ", recibeNotificaciones=" + recibeNotificaciones + '}';
    }
    
    

    public static class Builder {

        String nombre;
        String apellido;
        String legajo;
        String email;
        String celular;
        boolean recibeNotificaciones;

        public Builder(String nombre, String apellido, String legajo) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.legajo = legajo;
        }
        
        public Builder conEmail(String email) {
            this.email = email;
            return this;
        }
        
        public Builder conCelular(String celular) {
            this.celular = celular;
            return this;
        }
        
        public Builder conNotif(boolean recibeNotificaciones) {
            this.recibeNotificaciones = recibeNotificaciones;
            return this;
        }
        
        public Alumno build(){
            return new Alumno(this);
        }

    }

}
