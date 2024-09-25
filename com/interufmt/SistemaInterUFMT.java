package com.interufmt;

public class SistemaInterUFMT {
    public static void main(String[] args) {
        
        Atletica atletica1 = new Atletica("Trojan", "Instituto de Computação");
        Atletica atletica2 = new Atletica("Infernal", "Comunicação Social");

        // Criação de Jogadores
        Jogador jogador1 = new Jogador("Marlon", "Futsal", atletica1);
        Jogador jogador2 = new Jogador("Wilker", "Vôlei", atletica2);

        // Exibir informações dos jogadores e atléticas
        System.out.println("Informações dos Jogadores:");
        jogador1.exibirInformacoes();
        jogador2.exibirInformacoes();

        System.out.println();

        // Criação da Competição
        Competicao interUFMT = new Competicao("InterUFMT 2024");

        // Atribuição de pontos com base na colocação
        interUFMT.atribuirPontos(atletica1, 1); // Engenharia ficou em 1º lugar
        interUFMT.atribuirPontos(atletica2, 2); // Medicina ficou em 2º lugar

        System.out.println();

        // Exibir informações atualizadas das atléticas
        System.out.println("Pontuação Atualizada:");
        atletica1.exibirInformacoes();
        atletica2.exibirInformacoes();
    }
}
