package org.example.colas;

public class Cola <T> {
    private Nodo<T> frente;
    private Nodo<T> finalCola;

    public Cola() {
        this.frente = null;
        this.finalCola = null;
    }

    public boolean isEmpty() {
        return frente == null;
    }

    public void enqueue(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        if (this.isEmpty()) {
            this.frente = nuevoNodo;
        } else {
            this.finalCola.setSiguiente(nuevoNodo);
        }
        this.finalCola = nuevoNodo;
    }

    public T dequeue() {
        T dato = this.frente.getDato();
        this.frente = this.frente.getSiguiente();
        if (this.isEmpty()) {
            this.finalCola = null;
        }
        return dato;
    }

    public T front() {
        if (this.isEmpty()) {
            return null;
        } else {
            return this.frente.getDato();
        }
    }

}
