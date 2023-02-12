package edu.ubp.doo.modelo3;

/**
 * Se refiere al componente Product del patrón. 
 * Generalmente es una interfaz pero se decide declararlo como abstract
 * porque los demás triangulos heredan atributos de esta clase.
 * @author agustin
 */
public abstract class Triangulo {
    protected double lado1;
    protected double lado2;
    protected double lado3;
    
    public Triangulo(double... lados) {
        this.lado1 = lados[0];
        this.lado2 = lados[1];
        this.lado3 = lados[2];
    }
    
    /**
     * @return the lado1
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * @param lado1 the lado1 to set
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * @return the lado2
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * @param lado2 the lado2 to set
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * @return the lado3
     */
    public double getLado3() {
        return lado3;
    }

    /**
     * @param lado3 the lado3 to set
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    /**
     * *
     * Fórmula de Herón
     *
     * @return Devuelve la superficie del triangulo sabiendo los lados
     */
    public double calcularSuperficie() {
        double s = (this.lado1 + this.lado2 + this.lado3) / 2;
        double resIntermedio = s * ((s - this.lado1) * (s - this.lado2) * (s - this.lado3));
        double sup = Math.sqrt(Math.abs(resIntermedio));
        return sup;
    }
    
    public abstract String getNombre();
    
}
