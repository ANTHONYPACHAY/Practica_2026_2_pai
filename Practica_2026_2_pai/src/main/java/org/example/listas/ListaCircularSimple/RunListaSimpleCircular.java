package org.example.listas.ListaCircularSimple;

public class RunListaSimpleCircular {

    public static void main(String[] args) {
        ListaSimpleCircular<Integer> lista = new ListaSimpleCircular<Integer>();

        lista.recorrerLista();
//
//        Nodo<Integer> n2 = new Nodo<>(2);
//        Nodo<Integer> n3 = new Nodo<>(3);
//        Nodo<Integer> n4 = new Nodo<>(4);

        lista.insertarFinal(2);
        lista.insertarFinal(3);
        lista.insertarFinal(4);

        lista.recorrerLista();

//        Nodo<Integer> n5 = new Nodo<>(5);
        lista.insertarFinal(5);
        lista.recorrerLista();
        System.out.println("agregar al inicio");
        lista.insertarInicio(1);
        lista.recorrerLista();

        System.out.println("cantidad de nodos: " + lista.contarNodos());
        lista.insertarFinal(2);
        lista.insertarFinal(2);
        lista.recorrerLista();

        System.out.println("CANTIDAD DE VECES QUE SE REPITE EL [2]=" + lista.contarElementos(2));

        Nodo<Integer> NodoEncontrado = lista.buscarNodo(3);
        if ( NodoEncontrado != null ) {
            System.out.println("Nodo Encontrado: " + NodoEncontrado.getDato());
            System.out.println("siguiente: " + NodoEncontrado.getSiguiente().getDato());
        } else {
            System.out.println("Nodo no encontrado");
        }

        System.out.println( "----------");
        lista.recorrerLista();

        lista.eliminarPrimerNodo();
        lista.recorrerLista();

        lista.eliminarUltimoNodo();
        lista.recorrerLista();

//        lista.eliminarPorValor(5);
//        lista.eliminarPorValor(2);
//        lista.eliminarPorValor(2);
        lista.recorrerLista();
        System.out.println(lista.obtenerNodoEnPoicion(2).getDato());

        lista.insertarEnPosicion(2, 50);
        lista.recorrerLista();
    }

}
