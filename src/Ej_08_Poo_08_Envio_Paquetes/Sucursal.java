package Ej_08_Poo_08_Envio_Paquetes;

public class Sucursal {
    private int numeroSucursal;
    private String direccion;
    private String ciudad;
    private Paquete [] paquetes;

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Sucursal(int numeroSucursal, String direccion, String ciudad, Paquete [] nuevoPaquete) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.paquetes = nuevoPaquete;
    }

    @Override
    public String toString() {
        return "\nNúmero sucursal: " + numeroSucursal + ", Dirección: " + direccion + ", Ciudad: " + ciudad + getPaquetes();
    }

    public String getPaquetes(){
        String cadena = "\n.:Paquetes:.";
        for (Paquete p : paquetes) {
            cadena += "\n* "+ p.toString();
        }
        return cadena;
    }

}
