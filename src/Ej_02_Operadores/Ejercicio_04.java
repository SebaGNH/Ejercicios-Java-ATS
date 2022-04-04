import java.util.Scanner;
public class Ejercicio_04 {
/*
Una compañía de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales, mas una comisión de $150 por cada carro vendido,
más el 5% del valor de la venta por carro. Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes. hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
*/

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de autos que vendio el empleado: ");
        float cantAutosVendidos = sc.nextFloat();
        float comision1 = cantAutosVendidos * 150;
        
        System.out.print("Ingrese el valor del auto: ");
        float valorAuto = sc.nextFloat();
        float comision2 = (valorAuto * 0.05f) * cantAutosVendidos;


        float salarioPersonal = 1000 + comision1 + comision2;
        System.out.println("\nEl salario del empleado es: $"+salarioPersonal);

        sc.close();
    }
}
