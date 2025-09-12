package javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDotecladotest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do professor: ");
        String nome = scanner.nextLine();
        System.out.println("digite a idade do professor: ");
        int idade = scanner.nextInt();
        System.out.println("DIgite o seu sexo: (M/F)");
        char sexo = scanner.next().charAt(0);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        scanner.close();
    }

}
