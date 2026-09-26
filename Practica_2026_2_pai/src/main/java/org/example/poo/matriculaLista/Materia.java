package org.example.poo.matriculaLista;

public class Materia {
    private String nombre;
    private int creditos;
    private int cupos;

    public Materia(String nombre, int creditos, int cupos) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.cupos = cupos;
    }
//    public Materia() {
//        this("", 0, 0);
//    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return this.creditos;
    }
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    public int getCupos() {
        return this.cupos;
    }
    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public void mostrarDatos() {
        System.out.println("--------------------------");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Credito: " + this.creditos);
        System.out.println("Cupos: " + this.cupos);
        System.out.println("--------------------------");
    }

}
