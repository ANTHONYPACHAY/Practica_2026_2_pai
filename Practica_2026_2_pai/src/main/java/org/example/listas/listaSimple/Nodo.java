package org.example.listas.listaSimple;

public class Nodo {

    private int dato;
    private Nodo siguiente;

    public Nodo(int dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    public Nodo(int dato){
        this(dato, null);
    }

    public int getDato() {
        return this.dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void mostrarDatos() {
        System.out.println(this.dato);
    }



}
