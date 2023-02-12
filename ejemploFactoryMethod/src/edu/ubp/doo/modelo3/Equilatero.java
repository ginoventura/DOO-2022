package edu.ubp.doo.modelo3;

public class Equilatero extends Triangulo{

    public Equilatero(double... lados) {
        super(lados);
    }

    @Override
    public String getNombre() {
        return "Soy un triangulo Equilatero";
    }
    
}
