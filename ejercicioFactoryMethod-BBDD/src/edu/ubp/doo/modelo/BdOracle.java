package edu.ubp.doo.modelo;

public class BdOracle extends Bd{

    public BdOracle(String cadenaConexion) {
        super(cadenaConexion);
    }

    @Override
    public void insert() {
        System.out.println("Se ejecuta insert en Oracle");
    }

    @Override
    public void update() {
        System.out.println("Se ejecuta update en Oracle");
    }

    @Override
    public void delete() {
        System.out.println("Se ejecuta delete en Oracle");
    }
    
}
