package Ej_08_Poo_01_Cuadrilatero;

public class Cuadrilatero {
    private float area;
    private float perimetro;

    public Cuadrilatero(float area, float perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Area: " + area + ", Perimetro: " + perimetro;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
    
    public float getCalcularCuadrilatero(){
        return this.area * this.perimetro;
    }

}
