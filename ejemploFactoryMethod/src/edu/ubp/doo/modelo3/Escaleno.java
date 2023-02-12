package edu.ubp.doo.modelo3;

public class Escaleno extends Triangulo{

    public Escaleno(double... lados) {
        super(lados);
    }

    @Override
    public String getNombre() {
        return "Soy un triangulo Escaleno";
    }
    
}
