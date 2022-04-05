import java.util.Scanner;

public class Ejercicio_03_C {
/*
Programa que lea un caracter por teclado y compruebe si es una letra mayúscula
*/

public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Ingrese una letra para saber si es mayuscula o minuscula: ");
    char caracter = sc.next().charAt(0);

    if (Character.isUpperCase(caracter)) {
        System.out.println("\nEs mayuscula");
    } else {
        System.out.println("\nNo es mayuscula");
    }
    
    sc.close();
}
}
