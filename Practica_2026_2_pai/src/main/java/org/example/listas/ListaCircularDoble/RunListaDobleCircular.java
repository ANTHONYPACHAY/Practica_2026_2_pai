package org.example.listas.ListaCircularDoble;

public class RunListaDobleCircular {

    public static void main(String[] args) {

        ListaDobleCircular<Integer> lista = new ListaDobleCircular<>();

        lista.insertarInicio(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        lista.insertarFinal(4);
        lista.insertarFinal(5);

        lista.recorrerLista();
//        lista.recorrerListaInversa();
        System.out.println("Cantidad de elementos: " + lista.contarNodos());

//        lista.eliminarPrimerNodo();
//        lista.eliminarUltimoNodo();

//        lista.recorrerLista();

//        System.out.println("buscar nodo: " + lista.buscarNodo(3));
//        lista.eliminarPorValor(3);

        lista.recorrerLista();
        System.out.println("buscar nodo en posicion: " + lista.obtenerNodoEnPosicionV2(19));

        lista.insertarEnPosicion(2, -1);
        lista.recorrerLista();
    }

}
