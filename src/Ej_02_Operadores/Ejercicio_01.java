import java.util.Scanner;
public class Ejercicio_01 {
/*
Hacer un programa que calcule e imprima la suma de tres calificaciones
*/

public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el primer numero");    
    float num1 = sc.nextFloat();
    System.out.println("Ingrese el primer numero");
    float num2 = sc.nextFloat();
    System.out.println("Ingrese el primer numero");
    float num3 = sc.nextFloat();

    float suma = num1 + num2 + num3;

    System.out.println("\nLa suma es: "+suma);

    sc.close();
}

}
