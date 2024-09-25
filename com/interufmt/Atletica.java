package com.interufmt;

public class Atletica {
    private String nome;
    private String curso;
    private int pontos;

    public Atletica(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
        this.pontos = 0; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void adicionarPontos(int pontos) {
        this.pontos += pontos; 
    }

    public void exibirInformacoes() {
        System.out.println("Atlética: " + nome + " | Curso: " + curso + " | Pontos: " + pontos);
    }
}
