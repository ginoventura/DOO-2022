package edu.ubp.doo.modelo;

public class FabricaPlanPremium implements FabricaProducto{

    @Override
    public Producto getTv() {
        return new Tv("PREMIUM");
    }

    @Override
    public Producto getInternet() {
        return new Internet("PREMIUM");
    }   
}
