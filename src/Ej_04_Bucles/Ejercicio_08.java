package Ej_04_Bucles;

import java.util.Scanner;

/**
Ejercicio 8: Peedir un número N y mostrar todos los números del 1 al N y que la salida se muestre en una sola línea
 */
public class Ejercicio_08 {
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Ingrese un número: ");
    int numero = sc.nextInt();
    String cadena = "";
    for (int i = 1; i <= numero; i++) {
        cadena += i+ "  ";
    }
    System.out.println("Los números son");
    System.out.println(cadena);
    sc.close();
}
}