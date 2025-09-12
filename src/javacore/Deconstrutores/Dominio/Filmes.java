package javacore.Deconstrutores.Dominio;

public class Filmes {
private String Genero;
private String Titulo;
private int Duracao;
private String Diretor;
private String AtorPrincipal;

// Construtor padrão
public Filmes(  String genero, String titulo, int duracao, String diretor) {
    this.Genero = genero;
    this.Titulo = titulo;
    this.Duracao = duracao;
    this.Diretor = diretor;

}

public Filmes( String genero, String titulo, int duracao, String diretor, String atorPrincipal) {
    this(genero, titulo, duracao, diretor);
    this.AtorPrincipal = atorPrincipal;
}


public void imprime(){
    System.out.println("Gênero: " + this.Genero);
    System.out.println("Título: " + this.Titulo);
    System.out.println("Duração: " + this.Duracao + " minutos" + ", E o diretor do filme é " + this.Diretor);
    System.out.println("Ator Principal: " + this.AtorPrincipal);
}

public void setGenero(String genero){
    this.Genero = genero;}
    

public String getGenero(){
    return this.Genero;
}
public void setTitulo(String titulo){
    this.Titulo = titulo;

}
public String getTitulo(){
    return this.Titulo;
}
public void setDuracao(int duracao){
    this.Duracao = duracao;
}
public int getDuracao(){
    return this.Duracao;
}  
public void setDiretor(String diretor) {
    this.Diretor = diretor;
}
public String getDiretor() {
    return this.Diretor;
}
public String getAtorPrincipal() {
    return this.AtorPrincipal;
}
public void setAtorPrincipal(String atorPrincipal) {
    this.AtorPrincipal = atorPrincipal;}


}
