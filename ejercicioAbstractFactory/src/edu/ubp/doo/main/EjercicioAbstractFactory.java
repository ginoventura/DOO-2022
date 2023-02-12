package edu.ubp.doo.main;

import edu.ubp.doo.modelo.FabricaPlanPremium;
import edu.ubp.doo.modelo.FabricaPlanSimple;
import edu.ubp.doo.modelo.FabricaProducto;
import edu.ubp.doo.modelo.Producto;

public class EjercicioAbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaProducto fabrica;
        Producto producto;
        
        fabrica = new FabricaPlanSimple();
        producto = fabrica.getTv();
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
        System.out.println("Caracteristica: " + producto.getCaracteristica());
        System.out.println("---------------------------------");
        
        producto = fabrica.getInternet();
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
        System.out.println("Caracteristica: " + producto.getCaracteristica());
        System.out.println("---------------------------------");
        
        fabrica = new FabricaPlanPremium();
        producto = fabrica.getTv();
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
        System.out.println("Caracteristica: " + producto.getCaracteristica());
        System.out.println("---------------------------------");
        
        producto = fabrica.getInternet();
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
        System.out.println("Caracteristica: " + producto.getCaracteristica());
        System.out.println("---------------------------------");
    }
    
}
