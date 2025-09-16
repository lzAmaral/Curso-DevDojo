package javacore.Jmodificadorfinal.Test;
import javacore.Jmodificadorfinal.domain.Carros;
import javacore.Jmodificadorfinal.domain.Comprador;
public class CarroTest01 {
    public static void main(String[] args) {
    
    Carros carro = new Carros();
    
    System.out.println(carro.VELOCIDADE_LIMITE);
    System.out.println(carro.COMPRADOR);
    carro.COMPRADOR.setNome("Luiza");
    System.out.println(carro.COMPRADOR); 
    }

}
