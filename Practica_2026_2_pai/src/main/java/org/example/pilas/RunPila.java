package org.example.pilas;

public class RunPila {

    public static void main(String[] args) {
//        ejemplo01();

        Pila<String> historial = new Pila<>();

        historial.push("Crear documento");
        historial.push("Escribir título");
        historial.push("Insertar Imagen");


        System.out.println("Ultima acción: " + historial.peek());

        System.out.println("Deshaciendo todos los cambios...");
        while(!historial.isEmpty()) {
            System.out.println("Deshacer: " +  historial.pop());
        }

        System.out.println("¿Historial varío?: " + historial.isEmpty());



    }

    public static void ejemplo01() {

        Pila<Integer> pila = new Pila<>();

        pila.push(10);
        pila.push(20);
        pila.push(30);

        System.out.println("Elemento quitado de la pila: " + pila.pop());


        pila.push(40);

        System.out.println("Elemento consultado de la pila: " + pila.peek());
        System.out.println("Elemento consultado de la pila: " + pila.peek());

    }
}
