package javacore.Fmodificadoresestatico.test;
import javacore.Fmodificadoresestatico.domain.Carro;
public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro( "Jetta", 170.0);
        Carro c2 = new Carro( "Civic", 180.0);
        Carro c3 = new Carro( "Ferrari", 350.0);

        Carro.velocidadeLimite = 160; 

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }

}
