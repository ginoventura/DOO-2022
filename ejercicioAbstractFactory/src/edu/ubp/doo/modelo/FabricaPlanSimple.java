package edu.ubp.doo.modelo;

public class FabricaPlanSimple implements FabricaProducto{

    @Override
    public Producto getTv() {
        return new Tv("SIMPLE");
    }

    @Override
    public Producto getInternet() {
        return new Internet("SIMPLE");
    }
}
