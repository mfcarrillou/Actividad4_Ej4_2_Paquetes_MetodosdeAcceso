package ej4_2_paquetes_metodosdeacceso;

public class Oficina extends Local{
    protected static double valorArea = 3500000;
    protected boolean perteneceGobierno;
    
    protected Oficina(int id, int ar, String drccn, Localizacion tipo, boolean gob){
        super(id, ar, drccn,tipo);
        perteneceGobierno = gob;
    }
    
    protected void imprimir(){
        super.imprimir();
        System.out.println("¿Pertenece al gobierno?: " + perteneceGobierno);
    }
    
}