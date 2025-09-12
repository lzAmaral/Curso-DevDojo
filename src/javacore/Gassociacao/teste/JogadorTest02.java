package javacore.Gassociacao.teste;

import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
public static void main(String[] args) {
    Jogador jogador1 = new Jogador("Ronaldo");
    Time time1 = new Time("Real Madrid");

    jogador1.setTime(time1);

    jogador1.imprime();
    
}
}
