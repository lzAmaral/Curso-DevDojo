package javacore.Gassociacao.teste;

import javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
    Jogador jogador1 = new Jogador("Ronaldo");
    Jogador jogador2 = new Jogador("Ronaldinho");   
    Jogador jogador3 = new Jogador("Rivaldo");
    Jogador [] jogadores = {jogador1, jogador2, jogador3};
    for (Jogador jogador : jogadores) {
        jogador.imprime();
    }
}
}