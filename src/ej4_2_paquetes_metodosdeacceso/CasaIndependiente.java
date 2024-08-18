package ej4_2_paquetes_metodosdeacceso;

public class CasaIndependiente extends CasaUrbana {
    protected static double valorArea = 3000000;
    
    protected CasaIndependiente(int id, int ar, String drccn, int numHb, int numBns,int pisos){
        super(id,ar,drccn,numHb,numBns,pisos);
    }
    
    protected void imprimir(){
        super.imprimir();
    }
    
}