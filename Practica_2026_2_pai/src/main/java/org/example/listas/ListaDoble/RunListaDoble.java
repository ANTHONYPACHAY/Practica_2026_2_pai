package org.example.listas.ListaDoble;


import org.example.listas.listaSimpleGenerica.Persona;

public class RunListaDoble {
    public static void main(String[] args) {

        ListDoble<Persona> listDoble = new ListDoble();

        listDoble.insertarFinal(new NodoDoble<Persona>(new Persona("Miguel", 46)));
        listDoble.insertarFinal(new NodoDoble<Persona>(new Persona("Pepe", 26)));
        listDoble.insertarFinal(new NodoDoble<Persona>(new Persona("Luis", 36)));

        listDoble.imprimir();
        listDoble.imprimirAlRever();
        Persona persona = new Persona("Pepe", 26);
        Persona personaNueva = new Persona("Sara", 26);

        System.out.println("[CONTAR NODOS] " + listDoble.contarNodos());

        listDoble.insertarAntes(persona, personaNueva);
        listDoble.imprimir();
    }

    public static void usoNodoDoble() {
        NodoDoble<Integer> n1 = new NodoDoble<>(1);
    }
}
