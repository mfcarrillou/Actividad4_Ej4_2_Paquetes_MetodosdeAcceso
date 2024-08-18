package ej4_2_paquetes_metodosdeacceso;

public class Apartaestudio extends Apartamento {
    protected static double valorArea = 1500000;
    
    protected Apartaestudio(int id, int ar, String drccn){
        super(id, ar, drccn,1,1);  
    }
    
    protected void imprimir(){
        super.imprimir();
    }
    
}