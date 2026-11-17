package org.example.arbolBinario;

public class ArbolBinario {

    private Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(Integer dato) {
        this.raiz = this.insertarRecursivo(this.raiz, dato);
    }

    private Nodo insertarRecursivo(Nodo actual, Integer dato) {
        if (actual == null) {
            return new Nodo(dato);
        }

        if (dato < actual.getDato()) {
            actual.setIzquierdo(insertarRecursivo(actual.getIzquierdo(), dato));
        } else {
            actual.setDerecho(insertarRecursivo(actual.getDerecho(), dato));
        }
        return actual;
    }

    public void imprimirArbol() {
        System.out.println(" ================ [ESTRUCTURA DEL ÁRBOL] ===============");
        if (this.raiz == null) {
            System.out.println("Árbol vacío");
        } else {
            this.verArbol(this.raiz, "", true);
        }
        System.out.println(" =======================================================");
    }

    private void verArbol(Nodo actual, String prefijo, Boolean esDerecho) {
        if (actual == null) return;
        if (actual.getDerecho() != null) {
            verArbol(actual.getDerecho(), prefijo + (esDerecho ? "        " : "|       "), true);
        }

        System.out.print(prefijo);
        System.out.print(esDerecho ? "┌───" : "└───");
        System.out.println(" ("+ actual.getDato() + ")");

        if (actual.getIzquierdo() != null) {
            verArbol(actual.getIzquierdo(), prefijo + (esDerecho ? "        " : "|       "), false);
        }
    }


}
