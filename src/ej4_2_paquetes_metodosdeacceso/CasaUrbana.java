package ej4_2_paquetes_metodosdeacceso;

public class CasaUrbana extends Casa {
    
    protected CasaUrbana(int id, int ar, String drccn, int numHb, int numBns,int pisos){
        super(id,ar,drccn,numHb,numBns,pisos);
    }
    
    protected void imprimir(){
        super.imprimir();
    }

}