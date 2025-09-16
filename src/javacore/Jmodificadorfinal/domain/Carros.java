package javacore.Jmodificadorfinal.domain;

public class Carros {
    private String nome;

    public final Comprador COMPRADOR = new Comprador();
    
      public static final double VELOCIDADE_LIMITE;
    static {
        VELOCIDADE_LIMITE = 250;
    }
        

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
