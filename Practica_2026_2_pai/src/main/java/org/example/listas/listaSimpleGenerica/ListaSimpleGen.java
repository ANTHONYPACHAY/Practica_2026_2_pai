package org.example.listas.listaSimpleGenerica;

public class ListaSimpleGen<T> {
    private NodoGenerico<T> inicio;

    public ListaSimpleGen() {
        this.inicio = null;
    }

    public void recorrerLista() {
        System.out.println("-------- [recorrerLista] -------");
        NodoGenerico<T> indice = this.inicio;
        while(indice != null) {
            System.out.println(indice.getDato());
            indice = indice.getSiguiente();
        }
        System.out.println("---------------");
    }

    public void insertarInicio(NodoGenerico<T> nuevo) {
        nuevo.setSiguiente(this.inicio);
        this.inicio = nuevo;
    }

    public void insertarFinal(NodoGenerico<T> nuevo) {
        if (this.inicio == null) {
            this.inicio = nuevo;
        } else {
            NodoGenerico<T> ultimo = this.inicio;
            while (ultimo.getSiguiente() != null) {
                ultimo = ultimo.getSiguiente();
            }
            ultimo.setSiguiente(nuevo);
        }
    }

    public int contarNodos() {
        int cantidad = 0;
        NodoGenerico<T> ultimo = this.inicio;
        while(ultimo != null) {
            ultimo = ultimo.getSiguiente();
            cantidad++;
        }
        return cantidad;
    }

    public int contarElementos(T dato) {
        int cantidad = 0;
        NodoGenerico<T> ultimo = this.inicio;
        while(ultimo != null) {
            if(dato.equals(ultimo.getDato())) {
                cantidad++;
            }
            ultimo = ultimo.getSiguiente();
        }
        return cantidad;
    }

}
