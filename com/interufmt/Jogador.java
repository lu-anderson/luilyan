package com.interufmt;

public class Jogador {
    private String nome;
    private String modalidade; 
    private Atletica atletica;

    public Jogador(String nome, String modalidade, Atletica atletica) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.atletica = atletica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public Atletica getAtletica() {
        return atletica;
    }

    public void setAtletica(Atletica atletica) {
        this.atletica = atletica;
    }

    public void exibirInformacoes() {
        System.out.println("Jogador: " + nome + " | Modalidade: " + modalidade);
        atletica.exibirInformacoes(); 
    }
}
