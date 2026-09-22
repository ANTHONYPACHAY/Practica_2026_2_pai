package org.example.matriculaLista;

public class RunMatricula {

    public static void main(String[] args) {

        Matricula matriculaEstudiante = new Matricula();

        Materia programacionAvanzada1 = new Materia("Programacion Avanzada I", 4, 4);
        Materia probabilidad = new Materia("Probabilidad", 4, 4);
        Materia redes = new Materia("Redes", 4, 4);
        Materia electronica = new Materia("Electrónica", 4, 4);
        Materia electronica2 = new Materia("Electrónica 2", 4, 0);

        boolean respuesta;
        respuesta = matriculaEstudiante.inscribirMateria(programacionAvanzada1);
        System.out.println("¿Se matriculó?: " + (respuesta ? "SI" : "NO"));
        respuesta = matriculaEstudiante.inscribirMateria(probabilidad);
        System.out.println("¿Se matriculó?: " + (respuesta ? "SI" : "NO"));
        respuesta = matriculaEstudiante.inscribirMateria(redes);
        System.out.println("¿Se matriculó?: " + (respuesta ? "SI" : "NO"));

        matriculaEstudiante.imprimirMatricula();
        respuesta = matriculaEstudiante.inscribirMateria(electronica);
        System.out.println("¿Se matriculó?: " + (respuesta ? "SI" : "NO"));
        respuesta = matriculaEstudiante.inscribirMateria(electronica2);
        System.out.println("¿Se matriculó?: " + (respuesta ? "SI" : "NO"));

        matriculaEstudiante.imprimirMatricula();
        System.out.println("TOTAL DE CREDITOS: " + matriculaEstudiante.calcularTotalCreditos());;

    }
}
