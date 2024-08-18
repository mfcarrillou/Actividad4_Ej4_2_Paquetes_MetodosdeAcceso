package ej4_2_paquetes_metodosdeacceso;

public class Inmueble {
    protected int identificadorInmobiliario;
    protected int area; //en metros cuadrados.
    protected String direccion;
    protected double precioVenta;
    
    protected Inmueble(int id, int ar, String drccn){
        identificadorInmobiliario = id;
        area = ar;
        direccion = drccn;
    }
    
    protected void calcularPrecioVenta(double valorArea){
        precioVenta = valorArea * area;
    }
    
    protected void imprimir(){
        System.out.println("\nIdentificador inmobiliario: " + identificadorInmobiliario);
        System.out.println("Área: " + area);
        System.out.println("Dirección: " + direccion);
        System.out.println("Precio de venta: $" + precioVenta);
    }
    
}