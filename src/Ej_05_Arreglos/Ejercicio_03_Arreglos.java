package Ej_05_Arreglos;

import java.util.Scanner;

/**
Leer 5 números por teclado, almacenarlos en un arreglo y a continuación realizar la media de los números positivos, la media de los negativos y contar el número de ceros
 */
public class Ejercicio_03_Arreglos {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numeros[] = new int[5];
    float positivos = 0;
    float contadorPositivos = 0;
    float negativos = 0;
    float contadorNegativos = 0;
    float contadorCero = 0;
    for (int i = 0; i < numeros.length; i++) {
        System.out.print((i+1)+". Ingrese un número: ");
        numeros[i] = sc.nextInt();
        if (numeros[i] == 0) {
            contadorCero ++;
        }else if (numeros[i] > 0) {
            positivos += numeros[i];
            contadorPositivos ++;
        }else if (numeros[i] < 0) {            
            negativos += numeros[i];
            contadorNegativos ++;
        }
    }

    System.out.println("La media de positivos es: "+ (positivos / contadorPositivos));
    System.out.println("La media de negativos es: "+ (negativos/ contadorNegativos));
    System.out.println("Total de valores en cero: "+contadorCero);
    
    sc.close();
    }
}
