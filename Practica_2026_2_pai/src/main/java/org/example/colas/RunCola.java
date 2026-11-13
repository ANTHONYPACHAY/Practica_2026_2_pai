package org.example.colas;

public class RunCola {

    public static void main(String[] args) {
        Cola<String> impresiones = new Cola<>();

        impresiones.enqueue("Certificado de Ana");
        impresiones.enqueue("Informe de Bruno");

        System.out.println("[consultar]siguiente: " + impresiones.front());
        System.out.println("Atender: " + impresiones.dequeue());

        impresiones.enqueue("Solicitud de carla");

        System.out.println("Atender: " + impresiones.dequeue());
        System.out.println("Atender: " + impresiones.dequeue());

        System.out.println("¿Está vacío?"+ impresiones.isEmpty());

        impresiones.enqueue("Acta de diego");
        System.out.println("[consultar]siguiente: " + impresiones.front());

    }
}
