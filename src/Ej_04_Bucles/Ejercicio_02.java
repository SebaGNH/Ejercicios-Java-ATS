package Ej_04_Bucles;

import java.util.Scanner;
/*
Leer un número e indicar si es positivo o negativo.
El proceso se repetirá hasta que se introduzca un 0.
 */
public class Ejercicio_02 {
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);

    int numero = 0;
    do {
        System.out.print("Ingresar un numero e indicar si es positivo o negativo, pulse 0 para salir: ");
            numero = sc.nextInt();
        if (numero > 0) {
            System.out.println("El número es positivo");

        }else{
            System.out.println("El número es negativo");
        }

    } while (numero != 0);
    System.out.println("\nFin del programa");

    sc.close();
}
}
