package Ej_04_Bucles;

import java.util.Scanner;

/**
Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
 */
public class Ejercicio_06_Suma_Iterativa {
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    int numero = 0;
    int acumulador = 0;
    do {
        System.out.print("Ingrese un número para sumar: ");
        acumulador += numero = sc.nextInt();
    } while (numero != 0);

    System.out.println("La suma total es de: "+acumulador);
    
    sc.close();
}
}
