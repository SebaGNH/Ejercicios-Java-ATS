import java.util.Scanner;
public class Ejercicio_01_C {
/*
Hcaer un programa que lea un número entero y muestre si el número es multiplo de 10
*/
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);

    //Ingreso de datos
    System.out.print("Ingrese un numero entero: ");
    int numero = sc.nextInt();

    if (numero%10 == 0) {
        System.out.println("Es multiplo de 10");
    }else{
        System.out.println("No es multiplo de 10");
    }
    sc.close();
}
}
