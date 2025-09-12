package javacore.Eblocosdeinicializacao.Domain;

public class Filme {
    private String nome;
    private int[] episodios;
    // 1 - alocado espa;ço na memória para o objeto
    //2- cada atributo de classe e criado e inicializado com seus valores padrão    
    //3 - bloco de inicialização é executado
    //4 - construtor é executado
    
    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Filme(String nome) {
        this.nome = nome;
    }
    public Filme() {
        
        for (int episodio : this.episodios) {
            System.out.println("Episódio " + episodio + " do filme " + this.nome);
        }
    } 

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
    public int[] getEpisodios() {
        return episodios;

    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
