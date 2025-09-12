package javacore.CeSobreCargadeMetodos.Teste;
import javacore.CeSobreCargadeMetodos.Dominio.Filmes;

public class FilmeTeste01 {
public static void main(String[] args) {
    Filmes filme = new Filmes();
    filme.Init("Ação", "Vingadores Ultimato", 181, "Anthony Russo, Joe Russo");
   //filme.setGenero("Ação");
   // filme.setTitulo("Vingadores: Ultimato");
   // filme.setDuracao(181);
    filme.imprime();
}
}
