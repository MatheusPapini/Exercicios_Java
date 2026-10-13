package programacao_java;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nomeMaisNova = "";
        int idadeMaisNova = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = entrada.nextLine();
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = entrada.nextInt();
            entrada.nextLine(); // Limpar buffer

            if (idade < idadeMaisNova) {
                nomeMaisNova = nome;
                idadeMaisNova = idade;
            }
        }

        System.out.println("Nome da pessoa mais nova: " + nomeMaisNova);
    }
}