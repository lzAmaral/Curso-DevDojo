package javacore.Eblocosdeinicializacao.Test;
import javacore.Eblocosdeinicializacao.Domain.Filme;

public class FilmeTest01 {
    public static void main(String[] args) {
        Filme filme = new Filme( "The Walking Dead");

        for (int episodio : filme.getEpisodios()) {
            System.out.print(episodio + " ");
        }
         
     }
}
