package javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDotecladotest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("O grande software de previsao do futuro");
        System.out.println("Digite a sua pergunta e eu responderei SIM ou NÄO: ");
        String pergunta = scanner.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NÄO");
            scanner.close();
            
        }
    }

}
