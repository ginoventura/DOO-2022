package edu.ubp.doo.modelo3;

public class Isosceles extends Triangulo{

    public Isosceles(double... lados) {
        super(lados);
    }

    @Override
    public String getNombre() {
        return "Soy un triangulo Isosceles";
    }
    
}
