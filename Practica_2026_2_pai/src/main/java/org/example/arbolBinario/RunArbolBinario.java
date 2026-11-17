package org.example.arbolBinario;

public class RunArbolBinario {

    public static void main(String[] args) {
        ArbolBinario arbolBinario = new ArbolBinario();

//        arbolBinario.insertar(10);
        arbolBinario.insertar(5);
        arbolBinario.insertar(15);
        arbolBinario.insertar(20);
//        arbolBinario.insertar(14);

        arbolBinario.imprimirArbol();

        System.out.println("[Cantidad de elementos]: " + arbolBinario.contarElementos());
        System.out.println("[Altura]: " + arbolBinario.altura());
        System.out.println("[Perfecto]: " + arbolBinario.esPerfecto());
        System.out.println("[Lleno]: " + arbolBinario.esLLeno());
        System.out.println("[Completo]: " + arbolBinario.esCompleto());
        System.out.println("[Degenerado]: " + arbolBinario.esDegenerado());

    }
}
