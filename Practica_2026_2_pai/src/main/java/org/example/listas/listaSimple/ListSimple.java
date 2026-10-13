package org.example.listas.listaSimple;

public class ListSimple {

    private Nodo inicio;

    public ListSimple() {
        this.inicio = null;
    }

    public void recorrerLista() {
        System.out.println(" ------------------------------- ");
        Nodo indice = this.inicio;
        while(indice != null) {
            System.out.println(indice.getDato());
            indice = indice.getSiguiente();
        }
    }

    public void insertarInicio(Nodo nuevo) {
        nuevo.setSiguiente(this.inicio);
        this.inicio = nuevo;
    }

    public void insertarFinal(Nodo nuevo) {
        if (this.inicio == null) {
            this.inicio = nuevo;
        } else {
            Nodo ultimo = this.inicio;
            while(ultimo.getSiguiente() != null) {
                ultimo = ultimo.getSiguiente();
            }
            ultimo.setSiguiente(nuevo);
        }
    }

    public void insertarPosicion(int posicion, Nodo nuevo) {
        if (posicion == 0) {
            this.insertarInicio(nuevo);
        } else {
            int ind = 0;
            Nodo ultimo = this.inicio;
            while(ultimo.getSiguiente() != null && ind < posicion - 1) {
                ind = ind + 1;
                ultimo = ultimo.getSiguiente();
            }

            nuevo.setSiguiente(ultimo.getSiguiente());
            ultimo.setSiguiente(nuevo);
        }
    }

    public int contarNodos() {
        int cantidad = 0;
        // CONTAR
        Nodo ultimo = this.inicio;
        while(ultimo != null) {
            ultimo = ultimo.getSiguiente();
            cantidad++;
        }

        return cantidad;
    }
    public int sumarDatos(){
        int acumulador = 0;
        Nodo ultimo = this.inicio;
        while(ultimo != null) {
            acumulador += ultimo.getDato();
            ultimo = ultimo.getSiguiente();
        }
        return acumulador;
    }
    public int contarNumeros(int n){
        int contadornum =0;
        Nodo ultimo = this.inicio;
        while(ultimo != null) {
            if(ultimo.getDato() == n) {
                contadornum ++;
            }

            ultimo = ultimo.getSiguiente();
        }
        return contadornum;
    }

}
