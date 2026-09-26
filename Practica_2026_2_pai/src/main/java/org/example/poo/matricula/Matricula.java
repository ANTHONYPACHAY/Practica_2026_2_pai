package org.example.poo.matricula;

public class Matricula {

    Materia[] listaMaterias;

    public Matricula() {
        this.listaMaterias = new Materia[3];
    }

    public boolean inscribirMateria(Materia materia) {
        if(materia.getCupos() > 0) {
            int espacioEnBlanco = this.buscarEspacio();
            if ( espacioEnBlanco != -1) {
                materia.setCupos(materia.getCupos() - 1);
                this.listaMaterias[espacioEnBlanco] = materia;
                return true;
            } else {
                System.out.println("[Matricula.inscribirMateria]   NO HAY ESPACIO EN BLANCO");
                return false;
            }
        } else {
            System.out.println("[Matricula.inscribirMateria]   NO HAY CUPOS");
            return false;
        }
    }

    private int buscarEspacio() {
        int enBlanco = -1;
        for (int i = 0; i < this.listaMaterias.length; i++) {
            if (this.listaMaterias[i] == null) {
                enBlanco = i;
                break;
            }
        }
        return enBlanco;
    }

    public int calcularTotalCreditos() {
        int total = 0;
        for (int i = 0; i < this.listaMaterias.length; i++) {
            total += this.listaMaterias[i].getCreditos();
        }
        return total;
    }

    public void imprimirMatricula() {
        System.out.println("------------ [imprimirMatricula]--------------");
        for (int i = 0; i < this.listaMaterias.length; i++) {
            this.listaMaterias[i].mostrarDatos();
        }
        System.out.println("--------------------------");
    }

}
