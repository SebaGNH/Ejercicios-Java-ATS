package Ej_03_Condicionales;

import java.util.Scanner;

public class Ejercicio_06_C {
/*
Hacer un programa que tome dos números y diga si ambos son pares o impares
*/
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Ingrese el primer numero: ");
    int num1 = sc.nextInt();
    System.out.print("Ingrese el segundo numero: ");
    int num2 = sc.nextInt();
    
    if (num1%2 == 0 && num2%2 == 0) {
        System.out.println("Ambos son numeros par");
    }else if (num1%2 != 0 && num2%2 != 0) {
        System.out.println("Ambos numeros son impar");
    } else {
        System.out.println("Alguno de los numeros es par y otro impar");
    }

    sc.close();
}
}
