package org.example.arbolBinario;

public class RunArbolBinario {

    public static void main(String[] args) {
        ArbolBinario arbolBinario = new ArbolBinario();

//        arbolBinario.insertar(15);
//        arbolBinario.insertar(10);
////        arbolBinario.insertar(5);
//        arbolBinario.insertar(20);
////        arbolBinario.insertar(14);
//        arbolBinario.insertar(5);
//        arbolBinario.insertar(12);
//
//        arbolBinario.insertar(17);
//        arbolBinario.insertar(23);

//        arbolBinario.insertar(5);
//        arbolBinario.insertar(7);
//        arbolBinario.insertar(10);

//        arbolBinario.insertar(10);
//        arbolBinario.insertar(7);
//        arbolBinario.insertar(5);

        arbolBinario.insertar(20);
        arbolBinario.insertar(10);
        arbolBinario.insertar(30);
        arbolBinario.insertar(40);
        arbolBinario.insertar(50);

        arbolBinario.imprimirArbol();

        System.out.println("[Cantidad de elementos]: " + arbolBinario.contarElementos());
        System.out.println("[Altura]: " + arbolBinario.altura());
        System.out.println("[Perfecto]: " + arbolBinario.esPerfecto());
        System.out.println("[Lleno]: " + arbolBinario.esLLeno());
        System.out.println("[Completo]: " + arbolBinario.esCompleto());
        System.out.println("[Degenerado]: " + arbolBinario.esDegenerado());

        System.out.println(" [RECORRIDOS] ");
        System.out.println("PREORDEN: ");
        arbolBinario.preOrden();
        System.out.println("INORDEN: ");
        arbolBinario.inOrden();
        System.out.println("POSTORDEN: ");
        arbolBinario.postOrden();

        System.out.println("ROTACIÓN: ");
//        arbolBinario.rotacionDerecha();
        arbolBinario.rotacionIzquierda(30);
        arbolBinario.imprimirArbol();

    }
}
