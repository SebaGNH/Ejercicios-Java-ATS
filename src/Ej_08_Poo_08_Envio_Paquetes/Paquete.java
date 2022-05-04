package Ej_08_Poo_08_Envio_Paquetes;

public class Paquete {
    private int numeroReferencia;
    private String dni;
    private int peso;
    private int prioridad;


    
    
    // metodo Calcular precio

    public int getNumeroReferencia() {
        return numeroReferencia;
    }

    public String getDni() {
        return dni;
    }

    public int getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public Paquete(int numeroReferencia, String dni, int peso, int prioridad) {
        this.numeroReferencia = numeroReferencia;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return ", Número de referencia: " + numeroReferencia + ", DNI: " + dni + ", Peso: " + peso + ", Prioridad: " + prioridad;
    }
    
    public float getCalcularPrecio(){//0. normal - sin prioridad //  1. alta- 10 dolares extra // 2.express- 20 dolres 
        float calcularPrecio = this.peso;
        switch (prioridad) {
            case 1:
                calcularPrecio += 10;
                break;
            case 2:
                calcularPrecio += 20;                
                break; 
        }
        return calcularPrecio;
    }
    
    
}
