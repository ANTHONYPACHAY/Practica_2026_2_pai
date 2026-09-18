package org.example.persona;

public class RunPersona {

    public static void main(String[] args) {
        Persona p = new Persona("Miguel", "123");
//        Persona p = null;
        System.out.println("Nombre: " + p.getNombre());

        p.caminar();

        p.caminar(800.555555);
        p.caminar("la libertad");
        p.caminar(600, "santa elena");

        p.setIdentificacion("1230456789");


        System.out.println("Identificacion: " + p.getIdentificacion());

    }
}
