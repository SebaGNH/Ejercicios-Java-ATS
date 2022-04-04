import java.util.Scanner;
public class Ejercicio_05 {
/*
La calificación final de un estudiante de informatica se calcula con la base a las calificaciones de cuatro aspectos de su rendimiento academico:
participacion, primer examen parcial, segundo examen parcial y examen final, 
sabiendo que las calificaciones anteriores entran a la calificacion final con ponderaciones del 10% 25% 25% y 40%
hacer un programa que calcule e imprima la calificacion final obtenida por un estudiante
*/

public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);

    //Pedimos los datos necesarios
    System.out.println("ingrese la nota por participacion");
    float notaParticipacion = sc.nextFloat();
    System.out.println("ingrese la nota por examen parcial");
    float notaPrimerParcial = sc.nextFloat();
    System.out.println("ingrese la nota por segundo examen parcial");
    float notaSegundoParcial = sc.nextFloat();
    System.out.println("ingrese la nota por examen final");
    float notaExamenFinal = sc.nextFloat(); 
    
    //Sacamos los calculos
    notaParticipacion *= 0.10f;
    notaPrimerParcial *= 0.25f;
    notaSegundoParcial *= 0.25f;
    notaExamenFinal *= 0.40f;    

    //Suma de notas
    float calificacionFinal = notaParticipacion + notaPrimerParcial +  notaSegundoParcial + notaExamenFinal;

    //Imprimir resultado
    System.out.println("\nLa calificacion Final es: "+ calificacionFinal);

    sc.close();
}

}
