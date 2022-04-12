package Ej_08_Poo_05_Triangulo_Isoceles;

public class Triangulo {
    private double base;
    private double lado;

    public Triangulo(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "\nBase: " + base + "\nLado: " + lado+ "\nPerimetro: "+ getPerimetro()+"\nArea: "+getArea();
    }

    public double getBase() {
        return base;
    }

    public double getLado() {
        return lado;
    }


    public double getPerimetro(){
        return (this.lado * 2 ) + this.base; 
    }

    public double getArea(){
        return (base * Math.sqrt( (lado * lado) - ((base*base)/4) ) )/2;
    }
}