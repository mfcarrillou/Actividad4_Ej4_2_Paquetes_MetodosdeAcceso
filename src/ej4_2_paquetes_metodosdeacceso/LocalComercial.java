package ej4_2_paquetes_metodosdeacceso;

public class LocalComercial extends Local{
    protected static double valorArea = 3000000;
    protected String centroComercial;
    
    protected LocalComercial(int id, int ar, String drccn, Localizacion tipo, String cc){
        super(id, ar, drccn,tipo);
        centroComercial = cc;
    }
    
    protected void imprimir(){
        super.imprimir();
        System.out.println("Centro comercial : " + centroComercial);
    }
    
}