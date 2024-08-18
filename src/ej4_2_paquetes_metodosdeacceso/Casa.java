
package ej4_2_paquetes_metodosdeacceso;

public class Casa extends InmuebleVivienda {
    protected int cantidadPisos;
    
    protected Casa(int id, int ar, String drccn, int numHb, int numBns,int pisos){
        super(id,ar,drccn,numHb,numBns);
        cantidadPisos = pisos;
    }
    
    protected void imprimir(){
        super.imprimir();
        System.out.println("Cantidad de pisos: " + cantidadPisos);
    }

}