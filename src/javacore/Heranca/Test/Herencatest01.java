package javacore.Heranca.Test;

import javacore.Heranca.Domain.Endereco;
import javacore.Heranca.Domain.Funcionario;
import javacore.Heranca.Domain.Pessoa;

public class Herencatest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua A", "12345-678");
        Pessoa pessoa = new Pessoa("luiz");
        pessoa.setNome("Luiz");
        pessoa.setCpf("409.575.938-05");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Maria");
        funcionario.setNome("Maria");
        funcionario.setCpf("123.456.789-10");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);
        funcionario.imprime();
    }
}
