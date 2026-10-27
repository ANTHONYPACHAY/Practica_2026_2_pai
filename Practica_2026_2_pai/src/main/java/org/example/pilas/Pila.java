package org.example.pilas;

import java.util.NoSuchElementException;

public class Pila<T> {
    private Nodo<T> tope;

    public Pila() {
        this.tope = null;
    }

    public boolean isEmpty() {
        return this.tope == null;
    }

    public void push(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.setSiguiente(this.tope);
        this.tope = nuevo;
    }

    public T pop() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("La pila está vacia");
        }

        T dato = this.tope.getDato();
        this.tope = this.tope.getSiguiente();

        return dato;
    }

    public T peek() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("La pila está vacia");
        }
        return this.tope.getDato();
    }
}
