package org.example.listas.ListaCircularSimple;

public class ListaSimpleCircular <T> {

    Nodo<T> inicio;

    public ListaSimpleCircular() {
        this.inicio = null;
    }

    public Nodo<T> crearNodo(T valor) {
        return new Nodo<>(valor);
    }

    public Nodo<T> obtenerUltimo() {
        if (this.inicio == null) {
            return null;
        }
        Nodo<T> ultimo = this.inicio;
        while (ultimo.getSiguiente() != this.inicio) {
            ultimo = ultimo.getSiguiente();
        }
        return ultimo;
    }

    public void recorrerLista() {

        System.out.println(" ----------[recorrerLista]-------- ");
        Nodo<T> indice = this.inicio;
        // A - B - C - D [ D -> A]
        // inicio: X -> A | D -> X
        // A - B - C - D [ D -> A]
        // final: D -> x | x -> A

        // INICIO: NULL
        // indice: NULL
        if (this.inicio == null) {
            System.out.println("Lista vacia");
            return; // TERMINA LA FUNCIÓN
        }
        // INICIO: A
        // indice: A
        do {
            System.out.println(indice.getDato());
            indice = indice.getSiguiente();
            // (INDICE) B != A (INICIO)
            // (INDICE) C != A (INICIO)
            // (INDICE) D != A (INICIO)
            // (INDICE) A != A (INICIO)
        } while(indice != this.inicio);
        System.out.println(" ------------------ ");
    }

    public void insertarFinal(T nuevoDato) {
        Nodo<T> nuevo = crearNodo(nuevoDato);
        if (this.inicio == null) {
            nuevo.setSiguiente(nuevo);
            this.inicio = nuevo;
        } else {
            Nodo<T> ultimo = this.obtenerUltimo();
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(this.inicio);
        }
    }

    public void insertarInicio(T nuevoDato) {
        Nodo<T> nuevo = crearNodo(nuevoDato);
        if (this.inicio == null) {
            nuevo.setSiguiente(nuevo);
            this.inicio = nuevo;
        } else {
            Nodo<T> ultimo = this.obtenerUltimo();
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(this.inicio);
            this.inicio = nuevo;
        }
    }

    public int contarNodos() {
        if (this.inicio == null) {
            return 0;
        } else {
            int contador = 0;
            Nodo<T> indice = this.inicio;
            do {
//                System.out.println("iter[" + contador + "]: "+ indice.getDato());
                contador++;
                indice = indice.getSiguiente();
            } while (indice != this.inicio);
            return contador;
        }
    }

    public int contarElementos(T dato) {
        if (this.inicio == null) {
            return 0;
        } else{
            int cantidad = 0;
            Nodo<T> indice = this.inicio;
            do {
                if (dato.equals(indice.getDato())) {
                    cantidad++;
                }
                indice = indice.getSiguiente();
            } while(indice != this.inicio);

            return cantidad;
        }
    }

    public Nodo<T> buscarNodo(T valor) {
        if (this.inicio == null) {
            return null;
        } else {
            Nodo<T> indice = this.inicio;
            do {
                if (valor.equals(indice.getDato())) {
                    return indice;
                }
                indice = indice.getSiguiente();
            } while(indice != this.inicio);
            return null;
        }
    }

    public void eliminarPrimerNodo() {
        if (this.inicio == null) {
            return;
        }
        if (this.inicio.getSiguiente() == this.inicio) {
            this.inicio = null;
            return;
        }
        Nodo<T> ultimo = this.obtenerUltimo();
        ultimo.setSiguiente(this.inicio.getSiguiente());
        this.inicio = this.inicio.getSiguiente();
    }

    public void eliminarUltimoNodo() {
        if (this.inicio == null) {
            return;
        }
        if (this.inicio.getSiguiente() == this.inicio) {
            this.inicio = null;
            return;
        }
        Nodo<T> ultimo = this.inicio;
        while (ultimo.getSiguiente().getSiguiente() != this.inicio) {
            ultimo = ultimo.getSiguiente();
        }
        ultimo.setSiguiente(this.inicio);
    }

    public boolean eliminarPorValor(T valor) {
        if (this.inicio == null) {
            return false;
        }
        if (this.inicio.getDato().equals(valor)) {
            this.inicio = this.inicio.getSiguiente();
            return true;
        }
        Nodo<T> objetivo = null;
        Nodo<T> indice = this.inicio;
        do {
            if (valor.equals(indice.getSiguiente().getDato())) {
                objetivo = indice;
                break;
            }
            indice = indice.getSiguiente();
        } while(indice != this.inicio);

        if (objetivo != null) {
            objetivo.setSiguiente(objetivo.getSiguiente().getSiguiente());
            return true;
        }
        return false;
    }

    public Nodo<T> obtenerNodoEnPoicion(int posicion) {
        if (this.inicio == null || posicion < 0) {
            return null;
        }
        Nodo<T> indice = this.inicio;
        int indiceNum = 0;
        Nodo<T> objetivo = null;
        do {
            if (indiceNum == posicion) {
                return indice;
            }
            indiceNum++;
            indice = indice.getSiguiente();
        } while(indice != this.inicio);
        return null;
    }

    public boolean insertarEnPosicion(int posicion, T valor) {
        if (this.inicio == null || posicion < 0) {
            return false;
        }
        if (posicion == 0) {
            insertarInicio(valor);
        }
        Nodo<T> nuevoNodo = crearNodo(valor);
        Nodo<T> indice = this.inicio;
        int indiceNum = 0;
        do {
            if (indiceNum == (posicion - 1)) {
                nuevoNodo.setSiguiente(indice.getSiguiente());
                indice.setSiguiente(nuevoNodo);
                return true;
            }
            indiceNum++;
            indice = indice.getSiguiente();
        } while(indice != this.inicio);
        return false;
    }
}
