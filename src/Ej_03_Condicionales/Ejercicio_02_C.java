import java.util.Scanner;
public class Ejercicio_02_C {
/*
Pedir dos numeros y decir cual es el mayor o si son iguales
*/
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);

    //Pedir datos
    System.out.print("Ingrese el primer numero: ");
    int num1 = sc.nextInt();
    System.out.print("Ingrese el segundo numero: ");
    int num2 = sc.nextInt();

    if (num1 == num2) {
        System.out.println("Soun iguales");
    }else if(num1 > num2){
        System.out.println(num1+" es mayor que "+ num2);
    }else if (num1 < num2) {
        System.out.println(num2+" es mayor que "+ num1);        
    }

    sc.close();
}

}
