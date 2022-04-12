package Ej_08_Poo_04_Competencia_Atletismo;

public class Atleta {
    private int numero;
    private String nombre;
    private int tiempo;

    public Atleta(int numero, String nombre, int tiempo) {
        this.numero = numero;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }


    @Override
    public String toString() {
        return "\nNumero: " + numero + "\nNombre: " + nombre + "\nTiempo: " + tiempo;
    }
}