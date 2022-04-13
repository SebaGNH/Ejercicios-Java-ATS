package Ej_08_Poo_06_Numeros_Imaginarios;

public class NumeroImaginario {
    private double numeroA; //Parte real
    private double numeroB; //Parte imaginaria

    public NumeroImaginario(double numeroA, double numeroB) {
        this.numeroA = numeroA;
        this.numeroB = numeroB;
    }

    @Override
    public String toString() {
        return "\nNumero 1: " + numeroA + "\nNumero 2: " + numeroB;
    }

    public double getNumeroA() {
        return numeroA;
    }

    public double getNumeroB() {
        return numeroB;
    }
    
    /*
    numeroA = 3 + 4i
    numeroB = 2 + 5i
    suma    = 5 + 9i
    NumeroComplejo numeroA = new NumeroComplejo(3,4);
    numeroA.getSumaNumeros(numeroB)
    */
    public NumeroImaginario getSumarNumeros(NumeroImaginario imaginario){
        NumeroImaginario suma = new NumeroImaginario(numeroA+imaginario.getNumeroA(), numeroB + imaginario.getNumeroB());
        return suma;
    }

    /*
    numeroA = 3 + 4i
    numeroB = 2 + 5i
    Multi = (3*2 - 4*5) + (3*5 + 4*2)i
    */
    public NumeroImaginario getMultiplicacion(NumeroImaginario i){ // i = imaginario
        NumeroImaginario multi = new NumeroImaginario( ( numeroA * i.getNumeroA() - numeroB * i.getNumeroB() ), ( numeroA * i.getNumeroB()+ numeroB * i.getNumeroA() ));
        return multi;
    }


    /*
    numeroA = 3 + 4i
    numeroB = 3 + 4i
    */
    public boolean getComprobarIgualdad(NumeroImaginario imaginario){        
        if ( (numeroA== imaginario.getNumeroA()) && ( numeroB == imaginario.getNumeroB()) ) {
            return true;
        }
        return false;
    }

    /*
    numeroImaginario = 3 + 4i
    entero = 2; -- 2x3  2x4
    mult = 6 + 8i;
    */

    public NumeroImaginario getMultiplicarPorEntero(int numero){
        NumeroImaginario multi = new NumeroImaginario( numeroA * numero , numeroB * numero );
        return multi;
    }
    
}
