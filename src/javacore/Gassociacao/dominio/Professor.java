package javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (seminarios == null)
            return;
        System.out.println("Seminarios que o professor leciona: ");
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo());
            if (seminario.getLocal() != null) {
                System.out.println("Local: " + seminario.getLocal().getEndereço());
            }
            System.out.println("## ALUNOS ##");
            if (seminario.getAlunos() != null) {
                System.out.println("Alunos: ");
                for (Aluno aluno : seminario.getAlunos()) {
                    System.out.println(aluno.getNome() + " " + aluno.getIdade() + " anos");
                }
            }
            System.out.println("-------------------");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

}
