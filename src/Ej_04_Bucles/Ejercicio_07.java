package Ej_04_Bucles;

import java.util.Scanner;

/**
Ejercicio 7: pedir números hasta que se introduzca uno negativo y calcular la media
 */
public class Ejercicio_07 {
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    
    int numero;
    int contador = 0;
    int acumulador = 0;

    System.out.print("ingrese un número: ");
    numero = sc.nextInt();

    while (numero >= 0) {
        acumulador += numero;
        contador ++;
        System.out.print("Ingrese un número positivo o uno negativo y  se finaliza el programa: ");
        numero = sc.nextInt();
    }

    System.out.println("la media es: "+ (acumulador / contador));

    sc.close();
}
}
