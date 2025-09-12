package javacore.CeSobreCargadeMetodos.Dominio;

public class Filmes {
private String Genero;
private String Titulo;
private int Duracao;
private String Diretor;

public void Init(String genero, String titulo, int duracao) {
    this.Genero = genero;
    this.Titulo = titulo;
    this.Duracao = duracao;

}
// Sobrecarga do método Init para incluir o diretor
public void Init(String genero, String titulo, int duracao, String diretor) {
    this.Init(genero, titulo, duracao);
    this.Diretor = diretor;
}

public void imprime(){
    System.out.println("Gênero: " + this.Genero);
    System.out.println("Título: " + this.Titulo);
    System.out.println("Duração: " + this.Duracao + " minutos" + ", E o diretor do filme é " + this.Diretor);
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
}
