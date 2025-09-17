package javacore.Kenum.test;

import javacore.Kenum.dominio.Cliente;
import javacore.Kenum.dominio.TipoCliente;
import javacore.Kenum.dominio.TiposPagamentos;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Luiz", TipoCliente.PF, TiposPagamentos.CREDITO);

        Cliente cliente2 = new Cliente("Gustavo", TipoCliente.PJ, TiposPagamentos.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TiposPagamentos.DEBITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PJ");
        System.out.println(tipoCliente);
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa fisisca");
        System.out.println(tipoCliente2);

    }

}
