package edu.ubp.doo.main;

import edu.ubp.doo.modelo.SistemaMultiusuario;

public class EjemploSingleton {
    
    public static void main(String[] args) {

        SistemaMultiusuario sistema1 = SistemaMultiusuario.getInstancia();
        sistema1.login("agustín");
        sistema1.login("mónica");
        sistema1.login("pablo");
        
        SistemaMultiusuario sistema2 = SistemaMultiusuario.getInstancia();
        sistema2.logout("agustín");
        sistema2.logout("mónica");
        
        System.out.println("Cantidad de conectados: " + sistema1.getCantidadUsuariosConectados());
        System.out.println("Cantidad de conectados: " + sistema2.getCantidadUsuariosConectados());
        
    }
    
}
