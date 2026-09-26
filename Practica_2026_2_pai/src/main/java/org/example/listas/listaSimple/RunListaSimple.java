package org.example.listas.listaSimple;

import java.sql.SQLOutput;

public class RunListaSimple {

    public static void main(String[] args) {

        ListSimple listaSimple = new ListSimple();

        Nodo nodo0 = new Nodo(5);
        Nodo nodo1 = new Nodo(10);
        Nodo nodo2 = new Nodo(10);
        Nodo nodo3 = new Nodo(20);
        Nodo nodo4 = new Nodo(25);
        Nodo nodo5 = new Nodo(5);
        Nodo nodo6 = new Nodo(5);
        Nodo nodo7 = new Nodo(5);
        Nodo nodo8 = new Nodo(-1);
        listaSimple.insertarFinal(nodo0);
//        listaSimple.recorrerLista();

        listaSimple.insertarFinal(nodo1);
//        listaSimple.recorrerLista();

        listaSimple.insertarFinal(nodo2);
//        listaSimple.recorrerLista();

        listaSimple.insertarFinal(nodo3);
//        listaSimple.recorrerLista();

        listaSimple.insertarFinal(nodo4);
        listaSimple.insertarFinal(nodo6);
        listaSimple.insertarFinal(nodo7);
        listaSimple.insertarFinal(nodo8);
//        listaSimple.recorrerLista();

        listaSimple.insertarInicio(nodo5);
        listaSimple.recorrerLista();

        Nodo nodo9 = new Nodo(0);
        // listaSimple.insertarPosicion(2, nodo6);

        listaSimple.recorrerLista();

        int contador = listaSimple.contarNodos();
        System.out.println("El numero de nodos es: " +contador);
        int acumulador = listaSimple.sumarDatos();
        System.out.println("La suma de los nodos es: " +acumulador);

        int contadornum = listaSimple.contarNumeros(5);
        System.out.println("El numero 5 que se repite es: " + contadornum);

    }

}
