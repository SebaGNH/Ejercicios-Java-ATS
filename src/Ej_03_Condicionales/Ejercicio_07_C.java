import java.util.Scanner;

public class Ejercicio_07_C {
/*
Pedir tres números y mostrarlos ordenados de mayor a menor
*/
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Ingree el numero 1:");
    int num1 = sc.nextInt();
    System.out.print("Ingree el numero 2:");
    int num2 = sc.nextInt();
    System.out.print("Ingree el numero 3:");
    int num3 = sc.nextInt();

    int mayor = 0,medio = 0, menor = 0;


    if (num1>num2 && num1 > num3) {
        mayor = num1;
        if (num2>num3) {
            medio = num2;
            menor = num3;
        }else{
            medio = num3;
            menor = num2;
        }
    
    } else if(num2>num1 && num2 > num3){
        mayor = num2;
        if (num1>num3) {
            medio = num1;
            menor = num3;
        }else{
            medio = num3;
            menor =  num1;
        }
        
    }else if (num3 > num1 && num3 > num2) {
        mayor = num3;
        if (num1 > num2) {
            medio = num1;
            menor = num2;
        } else {
            medio = num2;
            menor = num1;
            
        }
    }

    System.out.println("El mayor es "+mayor+", el medio es "+ medio+", el menor es "+ menor);
    sc.close();
}

}
