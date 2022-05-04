package Ej_08_Poo_08_Envio_Paquetes;

public class Sucursal {
    private int numeroSucursal;
    private String direccion;
    private String ciudad;
    private Paquete paquetes;

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Paquete getPaquetes() {
        return paquetes;
    }

    public Sucursal(int numeroSucursal, String direccion, String ciudad, Paquete paquetes) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.paquetes = paquetes;
    }

    @Override
    public String toString() {
        return "Número sucursal: " + numeroSucursal + ", Dirección: " + direccion + ", Ciudad: " + ciudad + ", Pauete" + paquetes.toString();
    }

    
    
    
}
