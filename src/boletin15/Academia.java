package boletin15;

import Paquete.Persoal;

/**
 *
 * @author Leila
 */
public class Academia {

    static int numReferencia = 2020;
    private String nome;
    private int nota;
    private Persoal alumno;

    public Academia(String nome, int nota, Persoal alumno) {
        this.nome = nome;
        if (nota <= 10 && nota >= 0) {
            this.nota = nota;
        }
        this.alumno = alumno;
        numReferencia = numReferencia+1;
    }

    public Academia() {

    }

    public static int getNumReferencia() {

        return numReferencia;
    }

    public static void setNumReferencia(int numReferencia) {

        numReferencia = numReferencia+1;
        Academia.numReferencia = numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if (nota <= 10 && nota >= 0) {
            this.nota = nota;
        }

        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Persoal getAlumno() {
        return alumno;
    }

    public void setAlumno(Persoal alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Academia{" + "nome=" + nome + ", nota=" + nota + ", alumno=" + alumno + '}';
    }

}
