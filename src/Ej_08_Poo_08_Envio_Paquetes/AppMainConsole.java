package Ej_08_Poo_08_Envio_Paquetes;

import java.util.Scanner;
public class AppMainConsole {
    public static String getMostrarPaquetes(Paquete [] paquetes){
        String mostrarPaquetes = "";
        for (Paquete p : paquetes) {
            mostrarPaquetes += "\n" + p.toString();
        }
        return mostrarPaquetes;
    }

    public static String getSucursales(Sucursal sucursales){
        String mostrarSucursales = "";
        
        mostrarSucursales += sucursales.toString();
        return mostrarSucursales;
    }
public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);

    Sucursal sucursales;

    System.out.print("Indique el número de la sucursal: ");
    int numeroSucursal = sc.nextInt();
    sc.nextLine();
    System.out.print("Indique la dirección: ");
    String direccion = sc.nextLine();
    System.out.print("Indique la ciudad: ");
    String ciudad = sc.nextLine();
    System.out.print("Indique la cantidad de paquetes que va a agregar: ");
    int cantPaquetes = sc.nextInt();

/*  //Código para realizar pruebas sin tener que solicitar los datos anteriores
    int numeroSucursal = 888;
    String direccion = "Sipe Sipe 1200";
    String ciudad = "Elvine";
    int cantPaquetes = 2; */

    Paquete [] paquetes = new Paquete[cantPaquetes];

    for (int i = 0; i < cantPaquetes; i++) {
        System.out.print((1+i)+". Indique el número de referencia: ");
        int numeroReferencia = sc.nextInt();
        System.out.print((1+i)+". indique el DNI del propietario: ");
        String dni = sc.next();
        System.out.print((1+i)+". indique el peso del paquete: ");
        int peso = sc.nextInt();
        System.out.print((1+i)+". Prioridad: 0 = Normal, 1 = Alta, 2 = Express. ");
        int prioridad = sc.nextInt();
        paquetes[i] = new Paquete(numeroReferencia, dni, peso, prioridad);
        System.out.println("");
    }
    sucursales = new Sucursal(numeroSucursal, direccion, ciudad, paquetes);
    
    //System.out.println(getMostrarPaquetes(paquetes));

    System.out.println(getSucursales(sucursales));
    sc.close();
}
}