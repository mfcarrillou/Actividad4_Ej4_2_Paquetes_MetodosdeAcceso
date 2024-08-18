package ej4_2_paquetes_metodosdeacceso;

public class Apartamento extends InmuebleVivienda {
    
    protected Apartamento(int id, int ar, String drccn, int numHb, int numBns){
        super(id, ar, drccn, numHb, numBns);
    }
    
    protected void imprimir(){
        super.imprimir();
    }

}