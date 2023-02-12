package edu.ubp.doo.modelo;

public class BdMySql extends Bd{

    public BdMySql(String cadenaConexion) {
        super(cadenaConexion);
    }

    @Override
    public void insert() {
        System.out.println("Se ejecuta insert en MySQL");
    }

    @Override
    public void update() {
        System.out.println("Se ejecuta update en MySQL");
    }

    @Override
    public void delete() {
        System.out.println("Se ejecuta delete en MySQL");
    }
    
}
