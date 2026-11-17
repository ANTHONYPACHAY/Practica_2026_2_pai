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

}
