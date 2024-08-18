package ej4_2_paquetes_metodosdeacceso;

public class CasaRural extends Casa {
    protected static double valorArea = 1500000;
    protected int distanciaCabeceraMuni;
    protected int altitudNivelMar;
    
    protected CasaRural(int id, int ar, String drccn, int numHb, int numBns,int pisos, int distancia, int altitud){
        super(id,ar,drccn,numHb,numBns,pisos);
        distanciaCabeceraMuni = distancia;
        altitudNivelMar = altitud;
    }
    
    protected void imprimir(){
        super.imprimir();
        System.out.println("Distancia a la cabecera municipal: " + distanciaCabeceraMuni);
        System.out.println("Altitud sobre el nivel del mar: " + altitudNivelMar);
    }

}