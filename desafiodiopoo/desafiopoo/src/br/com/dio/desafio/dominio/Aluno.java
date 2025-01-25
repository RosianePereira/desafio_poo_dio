package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private final String nome;
    private final List<Curso> cursosInscritos;
    private final List<Curso> cursosConcluidos;

    public Aluno(String nome) {
        this.nome = nome;
        this.cursosInscritos = new ArrayList<>();
        this.cursosConcluidos = new ArrayList<>();
    }

    public void inscreverCurso(Curso curso) {
        cursosInscritos.add(curso);
        System.out.println(nome + " se inscreveu no curso: " + curso.getNome() + ". Descrição: " + curso.getDescricao() +
                ". Duração: " + curso.getDuracaoEmMeses() + " meses, Carga Horária: " + curso.getCargaHoraria() + " horas.");
    }

    public void concluirCurso(Curso curso) {
        cursosInscritos.remove(curso);
        cursosConcluidos.add(curso);
        System.out.println(nome + " concluiu o curso: " + curso.getNome() + ", Carga Horária: " + curso.getCargaHoraria() + " horas.");
    }

    public int calcularCargaHorariaTotal() {
        return cursosConcluidos.stream().mapToInt(Curso::getCargaHoraria).sum();
    }


    public void listarProgresso() {
        System.out.println("\nProgresso de " + nome + ":");
        System.out.println("Carga horária total concluída: " + calcularCargaHorariaTotal() + " horas");
    }
}














