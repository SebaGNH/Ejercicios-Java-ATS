package Ej_08_Poo_01_Cuadrilatero;

public class Cuadrilatero {
    private float lado1;
    private float lado2;

    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public Cuadrilatero(float lado1){
        this.lado1 = this.lado2 = lado1;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getPermietro(){
        return (lado1+lado2) * 2;
    }
    
    public float getArea(){
        return lado1 * lado2;
    }

    

}
