
package Ej_03_Condicionales;

import java.util.Scanner;

/*
En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los $300
Cual será la cantidad qeu pagará una persona por su compra?
*/
public class Ejercicio_04_C {

public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese el monto de la compra: ");
    float monto = sc.nextFloat();

    if (monto > 300) {
        monto = ((monto - 300) * 0.8f) + 300;
    }
    System.out.println("El monto a pagar es de $"+monto);

    sc.close();
}
}
