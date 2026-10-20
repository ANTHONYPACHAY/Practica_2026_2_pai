package org.example.listas.ListaCircularDoble;


public class ListaDobleCircular <T> {
    Nodo<T> inicio;

    public ListaDobleCircular() {
        this.inicio = null;
    }

    public Nodo<T> crearNodo(T valor) {
        return new Nodo<>(valor);
    }

    public void insertarInicio(T valor) {
        Nodo<T> nuevo = crearNodo(valor);

        if (this.inicio == null) {
            this.inicio = nuevo;
            this.inicio.setSiguiente(inicio);
            this.inicio.setAnterior(inicio);
        } else {
            Nodo<T> ultimo = this.inicio.getAnterior();

            nuevo.setSiguiente(this.inicio);
            nuevo.setAnterior(ultimo);

            this.inicio.setAnterior(nuevo);
            ultimo.setSiguiente(nuevo);

            this.inicio = nuevo;
        }
    }

    public void insertarFinal(T valor) {
        if (this.inicio == null) {
            this.insertarInicio(valor);
        } else {
            Nodo<T> nuevoUltimo = crearNodo(valor);

            Nodo<T> viejoUltimo = this.inicio.getAnterior();
            Nodo<T> inicio = this.inicio;

            nuevoUltimo.setAnterior(viejoUltimo);
            nuevoUltimo.setSiguiente(inicio);

            inicio.setAnterior(nuevoUltimo);
            viejoUltimo.setSiguiente(nuevoUltimo);

        }
    }

    public void recorrerLista() {
        System.out.println(" --------- [recorrerLista   INICIO] ------------");
        if (this.inicio == null) {
            System.out.println("Lista Vacia");
        } else {
            Nodo<T> indice = this.inicio;
            do {
                indice.mostrarDatos();
                indice = indice.getSiguiente();
            }
            while (indice != this.inicio);
        }
        System.out.println(" --------- [recorrerLista   FIN] ------------");
    }

    public void recorrerListaInversa() {
        System.out.println(" --------- [recorrerListaInversa   INICIO] ------------");
        if (this.inicio == null) {
            System.out.println("Lista Vacia");
        } else {
            Nodo<T> indice = this.inicio.getAnterior(); // ultimo
            do {
                indice.mostrarDatos();
                indice = indice.getAnterior();
            }
            while (indice != this.inicio.getAnterior());
        }
        System.out.println(" --------- [recorrerListaInversa   FIN] ------------");
    }

    public int contarNodos() {
        if (this.inicio == null) {
            return 0;
        } else {
            Nodo<T> indice = this.inicio;
            int contador = 0;
            do {
                contador++;
                indice = indice.getSiguiente();
            } while (indice != this.inicio);
            return contador;
        }
    }

    public void eliminarPrimerNodo() {
        if (this.inicio == null) {
            System.out.println("Lista Vacia");
        } else {
             Nodo<T> ultimo = this.inicio.getAnterior();
             Nodo<T> nuevoPrimero = this.inicio.getSiguiente();

             nuevoPrimero.setAnterior(ultimo);
             ultimo.setSiguiente(nuevoPrimero);

             this.inicio = nuevoPrimero;
        }
    }

    public void eliminarUltimoNodo() {
        if (this.inicio == null) {
            System.out.println("Lista Vacia");
        } else {
            Nodo<T> viejoUltimo = this.inicio.getAnterior();
            Nodo<T> nuevoUltimo = viejoUltimo.getAnterior();

            this.inicio.setAnterior(nuevoUltimo);
            nuevoUltimo.setSiguiente(this.inicio);
        }
    }

    public Nodo<T> buscarNodo(T valor) {
        if (this.inicio == null) {
            return null;
        } else {
            Nodo<T> objetivo = null;
            Nodo<T> indice = this.inicio;
            do {
                if (indice.getDato().equals(valor)) {
                    objetivo = indice;
                }
                indice = indice.getSiguiente();
            } while (indice != this.inicio);
            return objetivo;
        }
    }

    public void eliminarPorValor(T valor) {
        if (this.inicio == null) {
            System.out.println("Lista Vacia");
        } else {
            Nodo<T> objetivo = buscarNodo(valor);
            if (objetivo != null) {
                Nodo<T> tmpAnterior = objetivo.getAnterior();
                Nodo<T> tmpSiguiente = objetivo.getSiguiente();

                tmpAnterior.setSiguiente(tmpSiguiente);
                tmpSiguiente.setAnterior(tmpAnterior);
            }
        }
    }

    public Nodo<T> obtenerNodoEnPosicion(int posicion) {
        if (this.inicio == null) {
            return null;
        } else {
            Nodo<T> objetivo = null;
            Nodo<T> indice = this.inicio;
            int contador = 0;
            do {
                if (contador == posicion) {
                    objetivo = indice;
                }
                contador++;
                indice = indice.getSiguiente();
            } while (indice != this.inicio);
            return objetivo;
        }
    }

    public Nodo<T> obtenerNodoEnPosicionV2(int posicion) {
        if (this.inicio == null) {
            return null;
        } else {
            Nodo<T> objetivo = null;
            Nodo<T> indice = this.inicio;
            int contador = 0;
            do {
                if (contador == posicion) {
                    objetivo = indice;
                }
                contador++;
                indice = indice.getSiguiente();
            } while (contador <= posicion);
            return objetivo;
        }
    }

    public void insertarEnPosicion(int posicion, T valor) {
        if (this.inicio == null) {
            System.out.println("Lista Vacia");
        } else if (posicion == 0) {
            this.insertarInicio(valor);
        } else if(posicion < this.contarNodos()) {
            Nodo<T> objetivo = obtenerNodoEnPosicion(posicion);

            Nodo<T> tmpAnterior = objetivo.getAnterior();
            Nodo<T> tmpSiguiente = objetivo;

            Nodo<T> nuevo = this.crearNodo(valor);

            nuevo.setAnterior(tmpAnterior);
            nuevo.setSiguiente(tmpSiguiente);

            tmpAnterior.setSiguiente(nuevo);
            tmpSiguiente.setAnterior(nuevo);
        } else {
            System.out.println("Fuera del indice");
        }
    }

}
