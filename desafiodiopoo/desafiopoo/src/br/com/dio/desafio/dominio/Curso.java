package br.com.dio.desafio.dominio;

public abstract class Curso {
    private final String nome;
    private final String descricao;
    private final int duracaoEmMeses;
    private final int cargaHoraria;

    public Curso(String nome, String descricao, int duracaoEmMeses, int cargaHoraria) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracaoEmMeses = duracaoEmMeses;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDuracaoEmMeses() {
        return duracaoEmMeses;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

}


