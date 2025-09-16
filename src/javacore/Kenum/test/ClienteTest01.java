package javacore.Kenum.test;

import javacore.Kenum.dominio.Cliente;
import javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Luiz", TipoCliente.PF, Cliente.TiposPagamentos.CREDITO);

        Cliente cliente2 = new Cliente("Gustavo", TipoCliente.PJ, Cliente.TiposPagamentos.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

    }

}
