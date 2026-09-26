package org.example.poo.matriculaLista;

import java.util.ArrayList;
import java.util.List;

public class Matricula {

    List<Materia> listaMaterias;

    public Matricula() {
        this.listaMaterias = new ArrayList<>();
    }

    public boolean inscribirMateria(Materia materia) {
        if (materia.getCupos() > 0) {
            materia.setCupos(materia.getCupos() - 1);
            this.listaMaterias.add(materia);
            return true;
        } else {
            System.out.println("[Matricula.inscribirMateria]   NO HAY CUPOS");
            return false;
        }
    }

    public int calcularTotalCreditos() {
        int total = 0;
        for (int i = 0; i < this.listaMaterias.size(); i++) {
            total += this.listaMaterias.get(i).getCreditos();
        }
        return total;
    }

    public void imprimirMatricula() {
        System.out.println("------------ [imprimirMatricula]--------------");
        for (int i = 0; i < this.listaMaterias.size(); i++) {
            this.listaMaterias.get(i).mostrarDatos();
        }
        System.out.println("--------------------------");
    }

}
