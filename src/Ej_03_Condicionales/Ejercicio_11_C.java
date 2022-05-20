package Ej_03_Condicionales;

import java.util.Scanner;

/**
Ejercicio 11: Construir un programa que simule el funcionamiento de una calculadora que puede realizar ls cuatro operaciones básicas (suma,resta, multiplicación y division)
con valores numéricos enteros.
El usuario debe especificar la operación con el primer carácter del primer parámetro de la linea de comandos: S o s para sumar, R o r para restar, M o m para multiplicar y D o d para la división.
 */
public class Ejercicio_11_C {
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    

    System.out.print("Ingrese el primer número para realizar la operación: ");
    int numero_1 = sc.nextInt();

    System.out.print("ingrese el segundo número: ");
    int numero_2 = sc.nextInt();

    System.out.print("indique el tipo de peración = S o s para sumar, R o r para restar, D o d para dividir, M o m para multiplicar: ");
    char operacion = sc.next().toLowerCase().charAt(0);

    if (operacion == 's'){
        System.out.println("La operación suma de "+numero_1 +" más "+ numero_2 + " es de: "+(numero_1 + numero_2));

    } else if (operacion == 'r') {
        System.out.println("La operación resta de "+numero_1 +" menos "+ numero_2 + " es de: "+(numero_1 - numero_2));

    }else if (operacion == 'm') {
        System.out.println("La operación multiplicar de "+numero_1 +" por "+ numero_2 + " es de: "+(numero_1 * numero_2));

    }if (operacion == 'd') {
        System.out.println("La operación dividir de "+numero_1 +" dividido en "+ numero_2 + " es de: "+(numero_1 / numero_2));
    }    

    sc.close();
}
}
