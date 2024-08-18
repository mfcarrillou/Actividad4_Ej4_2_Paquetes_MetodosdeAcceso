package ej4_2_paquetes_metodosdeacceso;

public class ApartamentoFamiliar extends Apartamento {
    protected static double valorArea = 2000000;
    protected int valorAdmin;
    
    protected ApartamentoFamiliar(int id, int ar, String drccn, int numHb, int numBns, int admin){
        super(id, ar, drccn, numHb, numBns);
        valorAdmin = admin;
    }
    
    protected void imprimir(){
        super.imprimir();
        System.out.println("Valor de la administración: $" + valorAdmin);
    }
    
}