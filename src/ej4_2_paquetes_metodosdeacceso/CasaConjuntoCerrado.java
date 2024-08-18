package ej4_2_paquetes_metodosdeacceso;

public class CasaConjuntoCerrado extends CasaUrbana {
    protected static double valorArea = 2500000;
    protected int valorAdmin;
    protected boolean piscina;
    protected boolean camposDeportivos;
    
    protected CasaConjuntoCerrado(int id, int ar, String drccn, int numHb, int numBns,int pisos, int admin, boolean pscn, boolean camposdeportivos){
        super(id, ar, drccn, numHb, numBns, pisos);
        valorAdmin = admin;
        piscina = pscn;
        camposDeportivos = camposdeportivos;
    }
    
    protected void imprimir(){
        super.imprimir();
        System.out.println("Valor de la administración: $" + valorAdmin);
        System.out.println("¿Tiene piscina?: " + piscina);
        System.out.println("¿Tiene campos deportivos?: " + camposDeportivos);
    }
}