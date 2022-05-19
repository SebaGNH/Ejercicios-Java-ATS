
package Ej_03_Condicionales;

import java.util.Scanner;

/**
Ejercicio 9: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
* Suponiendo que todos los meses son de 30 días
 */
public class Ejercicio_09_C {
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Cargaremos la fecha, primero ingrese el día: ");
    int dia = sc.nextInt();
    if (dia>0 && dia <31) {
        System.out.print("Ingrese el mes: ");
        int mes = sc.nextInt();
        if (mes >0 && mes <13) {
            System.out.print("Ingrese el año: ");
            int anio = sc.nextInt();
            if (anio > 0 && anio < 2023) {
                System.out.println("La fecha ingresada es: "+dia +"/"+mes+"/"+anio);
            }
        }else{
            System.out.println("Mes invalido, los valores aceptables van entre 1 a 12");
        }
    }else{
        System.out.println("Día incorrecto, los días van del 1 al 30");
    }
    
    sc.close();
}
}
