
package Ej_08_Poo_03_Vehiculo;

import java.util.Scanner;

public class AppMainConsola {

    public static int indiceVehiculoMasBarato(Vehiculo vehiculos[]){
        float precio;
        int indice = 0;
        precio = vehiculos[0].getPrecio();
        for (int i = 1; i < vehiculos.length; i++) {
            if (vehiculos[i].getPrecio() < precio) {
                precio = vehiculos[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }


public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Ingrese la cantidad de vehiculos que va a cargar: ");
    int cantVehiculos = sc.nextInt();
    Vehiculo  vehiculos[] = new Vehiculo[cantVehiculos];

    for (int i = 0; i < vehiculos.length; i++) {
        System.out.print("Ingrese la marca: ");
        String marca = sc.next();
        System.out.print("ingrese el modelo: ");
        String modelo = sc.next();
        System.out.print("Ingrese el precio: ");
        float precio = sc.nextFloat();
        vehiculos[i] = new  Vehiculo(marca,modelo,precio);
    }


    //Otra manera de buscar el vehículo más barato
    /*  Vehiculo aux = new Vehiculo() ;
    for (int i = 0; i < vehiculos.length; i++) {
        if (vehiculos[i].getPrecio() < aux.getPrecio() || aux.getPrecio() == 0) {
            aux = vehiculos[i];
        }
    }
    System.out.println("El vehiculo mas barato es: "+ aux.toString());     */   


    System.out.println("El vehiculo mas barato es: "+ vehiculos[indiceVehiculoMasBarato(vehiculos)].toString());
    
    sc.close();
}


}
