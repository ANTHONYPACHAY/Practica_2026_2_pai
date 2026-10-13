package org.example.listas.listaSimpleGenerica;

public class NodoGenerico<T> {

//        1. ¿Qué significa la T de Nodo<T>?
//        a. Una variable entera
//        b. Un parámetro de tipo
//        c. Una clase obligatoria llamada T

    private T dato;
    private NodoGenerico<T> siguiente;

    public NodoGenerico(T dato, NodoGenerico<T> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    public NodoGenerico(T dato){
        this(dato, null);
    }

    public T getDato() {
        return this.dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoGenerico<T> getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(NodoGenerico<T> siguiente) {
        this.siguiente = siguiente;
    }

    public void mostrarDatos() {
        System.out.println(this.dato);
    }



}
