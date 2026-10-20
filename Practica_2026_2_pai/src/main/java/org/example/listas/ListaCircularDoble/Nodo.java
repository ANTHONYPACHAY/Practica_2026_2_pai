package org.example.listas.ListaCircularDoble;

public class Nodo <T> {
    private T dato;
    private Nodo<T> siguiente;
    private Nodo<T> anterior;

    public Nodo(T dato, Nodo<T> siguiente, Nodo<T> anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public Nodo(T dato) {
        this(dato, null, null);
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo<T> anterior) {
        this.anterior = anterior;
    }

    public void mostrarDatos() {
        System.out.println(dato);
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + dato +
                '}';
    }
}
