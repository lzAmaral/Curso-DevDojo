package javacore.Gassociacao.teste;

import javacore.Gassociacao.dominio.Escola;
import javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Luiza");
        Professor [] professores = {professor};
        Escola escola = new Escola ("DevDojo" , professores);
        escola.imprime();
    }

}
