package ej4_2_paquetes_metodosdeacceso;

public class Local extends Inmueble {
    protected Localizacion tipoLocal;
        
    protected Local(int id, int ar, String drccn, Localizacion tipo){
        super(id, ar, drccn);
        tipoLocal = tipo;
    }
    
    protected void imprimir(){
        super.imprimir();
        System.out.println("Tipo de local: " + tipoLocal);
    }
    
}