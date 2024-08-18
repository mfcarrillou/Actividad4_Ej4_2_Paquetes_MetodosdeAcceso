package ej4_2_paquetes_metodosdeacceso;

public class InmuebleVivienda extends Inmueble {
    protected int numHabitaciones;
    protected int numBanos;
    
    protected InmuebleVivienda(int id, int ar, String drccn, int numHb, int numBns){
        super(id, ar,drccn);
        numHabitaciones = numHb;
        numBanos = numBns;
    }
    
    protected void imprimir(){
        super.imprimir();
        System.out.println("Número de habitaciones: " + numHabitaciones);
        System.out.println("Número de baños: " + numBanos);
    }
    
}