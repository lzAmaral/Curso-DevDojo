package javacore.Kenum.dominio;

public class Cliente {


    private String nome;
    private TipoCliente tipoCliente;
    private TiposPagamentos tiposPagamentos;

    
    public Cliente(String nome, TipoCliente tipoCliente, TiposPagamentos tiposPagamentos) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tiposPagamentos = tiposPagamentos;
    }


    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", tipoCliente=" + tipoCliente + ", tiposPagamentos=" + tiposPagamentos + "]";
    }
    
   

}
