package org.example;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        FacturacionElectronica factura = null;

        // nueva instancia
        factura = new FacturacionElectronica("Pepe");
        System.out.println("dato del objeto; nombre = " + factura.nombreCliente);
        // nueva instacia 2
        factura = new FacturacionElectronica("Miguel", 25);
        System.out.println("dato del objeto; nombre = " + factura.nombreCliente);

        factura.imprimirFactura();

        System.out.println("IMPRIME PARAMTROS");
        factura.nombreCliente = "Rodrigo";

        factura.fecha = new Date("10/09/2026");

        System.out.println("dato del objeto; nombre = " + factura.nombreCliente);
        System.out.println("dato del objeto; nombre = " + factura.fecha);
        System.out.println("dato del objeto; nombre = " + factura.total);
    }
}