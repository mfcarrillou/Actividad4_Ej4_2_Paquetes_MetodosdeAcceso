package ej4_2_paquetes_metodosdeacceso;

import java.util.Scanner;

public class PruebaInmueble {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idaf, areaaf,hbtcnsaf,bnsaf,idae, areaae, adminaf;
        String drccnaf,drccnae;
        System.out.println("Apartamento Familiar");
        System.out.print("\tIngrese el identificador inmobiliario: ");
        idaf = entrada.nextInt();
        System.out.print("\tIngrese el área del apartamento, en metros cuadrados: ");
        areaaf = entrada.nextInt();
        entrada.nextLine();
        System.out.print("\tIngrese la dirección del apartamento: ");
        drccnaf = entrada.nextLine();
        System.out.print("\tIngrese el número de habitaciones del apartamento: ");
        hbtcnsaf = entrada.nextInt();
        System.out.print("\tIngrese el número de baños del apartamento: ");
        bnsaf = entrada.nextInt();
        System.out.print("\tIngrese el valor de la administración: ");
        adminaf = entrada.nextInt();
        ApartamentoFamiliar aptofamiliar = new ApartamentoFamiliar(idaf,areaaf,drccnaf,hbtcnsaf,bnsaf,adminaf);
        aptofamiliar.calcularPrecioVenta(aptofamiliar.valorArea);
        aptofamiliar.imprimir();
        

        System.out.println("\nApartaestudio");
        System.out.print("\tIngrese el identificador inmobiliario: ");
        idae = entrada.nextInt();
        System.out.print("\tIngrese el área del apartamento, en metros cuadrados: ");
        areaae = entrada.nextInt();
        entrada.nextLine();
        System.out.print("\tIngrese la dirección del apartamento: ");
        drccnae = entrada.nextLine();
        Apartaestudio apartaest = new Apartaestudio(idae,areaae,drccnae);
        apartaest.calcularPrecioVenta(apartaest.valorArea);
        apartaest.imprimir();
    }
    
}