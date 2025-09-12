package javacore.Fmodificadoresestatico.domain;

public class Filme {
    private String nome;
    private static int[] episodios;
    // 1 - alocado espa;ço na memória para o objeto
    //2- cada atributo de classe e criado e inicializado com seus valores padrão    
    //3 - bloco de inicialização é executado
    //4 - construtor é executado
    
   static  {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Filme(String nome) {
        this.nome = nome;
    }
    public Filme() {
        
        for (int episodio : Filme.episodios) {
            
            System.out.print(episodio + " ");
            System.out.print("-------------------------------");
        }
    } 

    public int[] getEpisodios() {
        return episodios;

    }
    public String getNome() {
        return nome;
    }
}
