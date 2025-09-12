package javacore.Gassociacao.teste;
import javacore.Gassociacao.dominio.Aluno;
import javacore.Gassociacao.dominio.Local;
import javacore.Gassociacao.dominio.Professor;
import javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua 1, Centro");
        Aluno aluno1 = new Aluno("Luiz",19);
        Professor professor1 = new Professor("Matheus", "Java");
        Aluno [] alunos = {aluno1};
        Seminario seminario = new Seminario("Java POO", new Aluno[]{aluno1}, local);
        Seminario[] seminarios = {seminario};
        professor1.setSeminarios(seminarios);
        professor1.imprime();
    }

}
