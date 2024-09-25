package com.interufmt;

public class Competicao {
    private String nomeCompeticao; 
    public Competicao(String nomeCompeticao) {
        this.nomeCompeticao = nomeCompeticao;
    }

    public String getNomeCompeticao() {
        return nomeCompeticao;
    }

    public void setNomeCompeticao(String nomeCompeticao) {
        this.nomeCompeticao = nomeCompeticao;
    }

    public void atribuirPontos(Atletica atletica, int colocacao) {
        int pontos = 0;

        switch (colocacao) {
            case 1:
                pontos = 10;
                break;
            case 2:
                pontos = 7;
                break;
            case 3:
                pontos = 5;
                break;
            default:
                pontos = 1;
                break;
        }

        atletica.adicionarPontos(pontos);  
        System.out.println("Pontos: " + atletica.getNome() + ": " + pontos + " pontos.");
    }
}
