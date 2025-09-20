package javacore.Lclassesabstratas.Test;

import javacore.Lclassesabstratas.domain.Desenvolvedor;
import javacore.Lclassesabstratas.domain.Funcionario;
import javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente funcionario = new Gerente("Luiz", 2000);
        Gerente gerente = new Gerente("Ana", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Gustavo", 10000);

        System.out.println(funcionario);
        System.out.println(gerente);
        System.out.println(desenvolvedor);

        desenvolvedor.imprime();
        gerente.imprime();
    }

}
