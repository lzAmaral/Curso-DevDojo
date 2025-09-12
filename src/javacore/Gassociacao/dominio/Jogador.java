package javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;
    public void imprime() {
        System.out.println("Jogador: " + this.nome);
        if (time != null) {
            System.out.println("Time: " + this.time.getNome());
        } else {
            System.out.println("Não tem time");
        }
        System.out.println("-------------------------");
    }

    public String getNome() {
        return nome;
    }
    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador(String nome) {
        this.nome = nome;
    }
}
