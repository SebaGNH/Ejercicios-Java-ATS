package Ej_05_Arreglos;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden introducido
 */
public class Ejercicio_01_Arreglos {
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    
    int [] numeros = new int[5];
    
    for (int i = 0; i < numeros.length; i++) {
        System.out.print("Ingrese el numero "+(i+1)+": ");
        numeros[i] = sc.nextInt();
    }
    
    System.out.println("");
    for (int numero : numeros) {
        System.out.println(numero);
    }
    sc.close();
}
}
