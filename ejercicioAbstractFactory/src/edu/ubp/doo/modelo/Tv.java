package edu.ubp.doo.modelo;

public class Tv implements Producto{

    TipoPlan tipo;

    public Tv(String tipo) {
        this.tipo = new TipoPlan(tipo);
        
    }
    
    @Override
    public String getNombre() {
        return "TV Plan " + this.tipo.getTipo();
    }

    @Override
    public float getPrecio() {
        return  this.tipo.getTipo().equals("PREMIUM")?300.0f:120.0f;
    }

    @Override
    public String getCaracteristica() {
        return this.tipo.getTipo().equals("PREMIUM")?"250 canales":"50 canales";
    }

    @Override
    public TipoPlan getTipoPlan() {
        return tipo;
    } 
}
