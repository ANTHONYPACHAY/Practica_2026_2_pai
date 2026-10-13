package org.example.listas.ListaDoble;

import org.example.listas.listaSimpleGenerica.NodoGenerico;

public class ListDoble<T> {
    private NodoDoble<T> inicio;

    public ListDoble() {
        this.inicio = null;
    }

    public void imprimir() {
        System.out.println("-------- [imprimir] -------");
        NodoDoble<T> indice = this.inicio;
        while(indice != null) {
            System.out.println(indice.getDato());
            indice = indice.getSiguiente();
        }
        System.out.println("---------------");
    }


    public NodoDoble<T> ultimoElemento() {
        NodoDoble<T> ultimo = this.inicio;
        while (ultimo.getSiguiente() != null) {
            ultimo = ultimo.getSiguiente();
        }
        return ultimo;
    }

    public void imprimirAlRever() {
        System.out.println("-------- [imprimirAlRever] -------");
        NodoDoble<T> indice = ultimoElemento();
        while(indice != null) {
            System.out.println(indice.getDato());
            indice = indice.getAnterior();
        }
        System.out.println("---------------");
    }

    public void insertarInicio(NodoDoble<T> nuevo) {
        nuevo.setSiguiente(this.inicio);
        this.inicio = nuevo;
    }

    public void insertarFinal(NodoDoble<T> nuevo) {
        if (this.inicio == null) {
            this.inicio = nuevo;
        } else {
            NodoDoble<T> ultimo = ultimoElemento();
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
        }
    }

    public int contarNodos() {
        int cantidad = 0;
        NodoDoble<T> ultimo = this.inicio;
        while(ultimo != null) {
            ultimo = ultimo.getSiguiente();
            cantidad++;
        }
        return cantidad;
    }

    public int contarElementos(T dato) {
        int cantidad = 0;
        NodoDoble<T> ultimo = this.inicio;
        while(ultimo != null) {
            if(dato.equals(ultimo.getDato())) {
                cantidad++;
            }
            ultimo = ultimo.getSiguiente();
        }
        return cantidad;
    }

    public NodoDoble<T> buscarElemento(T dato) {
        NodoDoble<T> ultimo = this.inicio;
        while(ultimo != null) {
            if(dato.equals(ultimo.getDato())) {
                return ultimo;
            }
            ultimo = ultimo.getSiguiente();
        }
        return null;
    }

    public void insertarAntes(T objetivo, T nuevo) {
        NodoDoble<T> nodoObjetivo = buscarElemento(objetivo);

        if (nodoObjetivo == null) {
            System.out.println("No se encontro el elemento");
            return;
        }

        NodoDoble<T> nodoNuevo = new NodoDoble(nuevo);
        // no es el primero
        if (nodoObjetivo.getAnterior() != null) {
            NodoDoble<T> anteriorOld = nodoObjetivo.getAnterior();

            anteriorOld.setSiguiente(nodoNuevo);
            nodoNuevo.setSiguiente(nodoObjetivo);
            nodoNuevo.setAnterior(anteriorOld);
            nodoObjetivo.setAnterior(nodoNuevo);
        } else {
            this.inicio = nodoNuevo;
            nodoNuevo.setSiguiente(nodoObjetivo);
            nodoObjetivo.setAnterior(nodoNuevo);
        }
    }
}
