package org.example;

import java.util.Date;

public class FacturacionElectronica {

    public String nombreCliente;
    public Date fecha;
    public float total;

    public FacturacionElectronica() {
        System.out.println("FacturacionElectronica, constructor 1");
    }

    public FacturacionElectronica(String nombreCliente) {
        System.out.println("FacturacionElectronica, constructor 2");
        this.nombreCliente = nombreCliente;
        System.out.println("FacturacionElectronica, nombreCliente: " + this.nombreCliente);
    }
    public FacturacionElectronica(String nombreCliente, Date fecha, float total) {
        System.out.println("FacturacionElectronica, constructor 3");
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.total = total;
    }
    public FacturacionElectronica(String nombreCliente, float total) {
        System.out.println("FacturacionElectronica, constructor 4");
        this.nombreCliente = nombreCliente;
        this.total = total;
        this.fecha = new Date();
    }

    public void imprimirFactura() {
        System.out.println("nombreCliente: " + this.nombreCliente);
        System.out.println("fecha: " + this.fecha);
        System.out.println("total: " + this.total);
    }

    public void asignarFecha(Date fecha) {
        // IF FECHA > TAL CUAL
        this.fecha = fecha;
    }
}
