package org.example.arbolBinario;

public class ArbolBinario {

    private Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(Integer dato) {
        this.raiz = this.insertar_(this.raiz, dato);
    }

    private Nodo insertar_(Nodo actual, Integer dato) {
        if (actual == null) {
            return new Nodo(dato);
        }

        if (dato < actual.getDato()) {
            actual.setIzquierdo(insertar_(actual.getIzquierdo(), dato));
        } else {
            actual.setDerecho(insertar_(actual.getDerecho(), dato));
        }
        return actual;
    }

    public void imprimirArbol() {
        System.out.println(" ================ [ESTRUCTURA DEL ÁRBOL] ===============");
        if (this.raiz == null) {
            System.out.println("Árbol vacío");
        } else {
            this.imprimirArbol_(this.raiz, "", true);
        }
        System.out.println(" =======================================================");
    }

    private void imprimirArbol_(Nodo actual, String prefijo, Boolean esDerecho) {
        if (actual == null) return;
        if (actual.getDerecho() != null) {
            imprimirArbol_(actual.getDerecho(), prefijo + (esDerecho ? "        " : "|       "), true);
        }

        System.out.print(prefijo);
        System.out.print(esDerecho ? "┌───" : "└───");
        System.out.println(" ("+ actual.getDato() + ")");

        if (actual.getIzquierdo() != null) {
            imprimirArbol_(actual.getIzquierdo(), prefijo + (esDerecho ? "        " : "|       "), false);
        }
    }

    public Integer contarElementos() {
        return this.contarElementos_(this.raiz);
    }

    private Integer contarElementos_(Nodo actual) {
        if (actual == null) return 0;
        return 1 + contarElementos_(actual.getIzquierdo()) + contarElementos_(actual.getDerecho());
    }

    public Integer altura() {
        return this.altura_(this.raiz);
    }
    private Integer altura_(Nodo actual) {
        if (actual == null) return -1;

        return 1 + Math.max(
                altura_(actual.getIzquierdo()),
                altura_(actual.getDerecho())
        );
    }

    public boolean esPerfecto() {
        int totalNodos = this.contarElementos();
        int h = this.altura();
        return totalNodos == (Math.pow(2, h + 1)) - 1;
    }

    public boolean esLLeno() {
        return this.esLLeno_(this.raiz);
    }
    public boolean esLLeno_(Nodo actual) {
        if (actual == null) return true;
        if (actual.getIzquierdo() == null && actual.getDerecho() == null) return true;
        if (actual.getIzquierdo() != null && actual.getDerecho() != null) {
            return this.esLLeno_(actual.getIzquierdo()) && this.esLLeno_(actual.getDerecho());
        }
        return false;
    }

    public boolean esCompleto() {
        return this.esCompleto_(this.raiz, 0, this.contarElementos());
    }
    private boolean esCompleto_(Nodo actual, int indice, int numeroNodos) {
        if (actual == null) return true;
        if (indice >= numeroNodos) {
            return false;
        }
        return esCompleto_(actual.getIzquierdo(), 2 * indice + 1, numeroNodos)
                 && esCompleto_(actual.getDerecho(), 2 * indice + 2, numeroNodos);
    }

    public boolean esDegenerado() {
        return this.esDegenerado_(this.raiz);
    }
    public boolean esDegenerado_(Nodo actual) {
        if (actual == null) return true;
        if (actual.getIzquierdo() != null && actual.getDerecho() != null) return false;

        return this.esDegenerado_(actual.getIzquierdo())
                && this.esDegenerado_(actual.getDerecho());
    }

}
