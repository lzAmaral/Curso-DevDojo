package javacore.Kenum.dominio;

public enum TipoCliente {
 PF(1),
 PJ(2);

 public int VALOR;
private String nomeRelatorio;
TipoCliente(int valor){
   this.VALOR = valor;
   this.nomeRelatorio = nomeRelatorio;
}

public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
for ( TipoCliente tipoCliente : values()){
   if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
      return tipoCliente;
   }
}
return null;
}


public String getNomeRelatorio() {
  return nomeRelatorio;
}
public void setNomeRelatorio(String nomeRelatorio) {
  this.nomeRelatorio = nomeRelatorio;
}
}
