package Ej_05_Arreglos;

import java.util.Scanner;

/**
Leer 5 números, guardarlos en un arreglo y mostrarlos en orden inverso al introducido
 */
public class Ejercicio_02_Arreglos {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        int [] numeros = new int[5];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i+1)+"- Ingrese el numero: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 5; i > 0; i--) {
            System.out.println(numeros[i]);
        }
        sc.close();
    }
    
}
