package org.example.poo.matricula;

public class RunMatricula {

    public static void main(String[] args) {

        Matricula matriculaEstudiante = new Matricula();

        Materia programacionAvanzada1 = new Materia("Programacion Avanzada I", 4, 4);
        Materia probabilidad = new Materia("Probabilidad", 4, 4);
        Materia redes = new Materia("Redes", 4, 4);
        Materia electronica = new Materia("Electrónica", 4, 4);
        Materia electronica2 = new Materia("Electrónica 2", 4, 4);
        matriculaEstudiante.inscribirMateria(programacionAvanzada1);
        matriculaEstudiante.inscribirMateria(probabilidad);
        matriculaEstudiante.inscribirMateria(redes);

        matriculaEstudiante.imprimirMatricula();
        matriculaEstudiante.inscribirMateria(electronica);
        matriculaEstudiante.inscribirMateria(electronica2);

        matriculaEstudiante.imprimirMatricula();
        System.out.println("TOTAL DE CREDITOS: " + matriculaEstudiante.calcularTotalCreditos());;

    }
}
