package org.example.listas.listaSimpleGenerica;

import org.example.listas.listaSimple.Nodo;

public class RunListaSimpleGenerica {

    public static void main(String[] args) {

//        ejemploUsoNodoGenerico();

        NodoGenerico<Persona> ng1 = new NodoGenerico<>(new Persona("Miguel", 25));
        NodoGenerico<Persona> ng2 = new NodoGenerico<>(new Persona("Sofia", 38));
        NodoGenerico<Persona> ng3 = new NodoGenerico<>(new Persona("Carlos", 16));

        ListaSimpleGen<Persona> lista = new ListaSimpleGen<>();
        lista.insertarFinal(ng1);
        lista.insertarFinal(ng2);
        lista.insertarFinal(ng3);

        System.out.println("CONTAR NODOS: " + lista.contarNodos());

        lista.recorrerLista();

        Persona persona = new Persona("MigueL", 25);

        System.out.println("Contar elementos "+ persona + " | veces: " + lista.contarElementos(persona));
    }

    public static void ejemploUsoNodoGenerico() {

        NodoGenerico<String> ng1 = new NodoGenerico<String>("Miguel de Servantes");
        NodoGenerico<String> ng2 = new NodoGenerico<String>("Jose da Silva");

        NodoGenerico<Double> ng3 = new NodoGenerico<Double>(1.1);

        NodoGenerico<Integer> ng4 = new NodoGenerico<Integer>(1);

        NodoGenerico<Boolean> ng5 = new NodoGenerico<Boolean>(true);

        Persona persona = new Persona("Juan", 30);
        NodoGenerico<Persona> ng6 = new NodoGenerico<Persona>(persona);

        ng6.mostrarDatos();
    }
}
