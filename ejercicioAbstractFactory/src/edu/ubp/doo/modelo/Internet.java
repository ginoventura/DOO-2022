package edu.ubp.doo.modelo;

public class Internet implements Producto{

    TipoPlan tipo;
    
    public Internet(String tipo) {
        this.tipo = new TipoPlan(tipo);
    }
    
    @Override
    public String getNombre() {
        return "Internet Plan " + this.tipo.getTipo();
    }

    @Override
    public float getPrecio() {
        return this.tipo.getTipo().equals("PREMIUM")?450.0f:100.0f;
    }

    @Override
    public String getCaracteristica() {
        return this.tipo.getTipo().equals("PREMIUM")?"7 MBytes":"3 MBytes";
    }

    @Override
    public TipoPlan getTipoPlan() {
        return this.tipo;
    }    
}
