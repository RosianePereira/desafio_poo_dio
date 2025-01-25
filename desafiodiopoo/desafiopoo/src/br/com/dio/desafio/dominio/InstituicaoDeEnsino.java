package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class InstituicaoDeEnsino {
    private final String nome;
    private final  List<Curso> cursosOferecidos;

    public InstituicaoDeEnsino(String nome) {
        this.nome = nome;
        this.cursosOferecidos = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        if (!cursosOferecidos.contains(curso)) {
            cursosOferecidos.add(curso);
        } else {
            System.out.println("O curso " + curso.getNome() + " já está cadastrado.");
        }
    }

}





