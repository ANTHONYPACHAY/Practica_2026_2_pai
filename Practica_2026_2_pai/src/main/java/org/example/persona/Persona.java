package org.example.persona;

public class Persona {

    // atributos
    private String nombre;
    private String identificacion;
    // constructor

    public Persona(String nombres, String identificacion) {
        this.nombre = nombres;
        this.identificacion = identificacion;
    }

    public Persona(String nombre) {
        this(nombre,"");
    }

    public Persona() {
        this("","");
    }
    //métodos
    // sobrecarga
    public void caminar() {
        System.out.println(this.nombre + " está caminando...");
    }
    public void caminar(double distancia) {
        String mensaje = String.format("[FORMAT] %s está caminando %.1f metros ...", this.nombre, distancia);
        System.out.println(mensaje);
    }
    public void caminar(String destino) {
        System.out.println(this.nombre + " está caminando a " + destino + " ...");
    }
    public void caminar(double distancia, String destino) {
        System.out.println(this.nombre + " está caminando " + distancia + " metros a " + destino + " ...");
    }

    // encapsulamiento
    // getters y setters
    // getters: GET => obtener

    public String getIdentificacion() {
        return this.identificacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    //setters: SET => Asignar
    public void setIdentificacion(String identificacion) {
        if (identificacion.length() == 10) {
            this.identificacion = identificacion;
        } else if (identificacion.isEmpty()) {
            System.out.println("ESA IDENTIFICACIÓN ESTÁ VACIA");
        } else {
            System.out.println("LA NUEVA IDENTIFICACIÓN TIENE " + identificacion.length() + " caracteres de 10.");
        }
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
