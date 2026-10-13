package comando_repeticao;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nomeMaisNova = "";
        int menorIdade = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa " + (i+1) + ": ");
            String nome = entrada.nextLine();
            System.out.print("Digite a idade da pessoa " + (i+1) + ": ");
            int idade = entrada.nextInt();
            entrada.nextLine(); // Limpar buffer

            if (idade < menorIdade) {
                menorIdade = idade;
                nomeMaisNova = nome;
            }
        }
        System.out.println("Pessoa mais nova: " + nomeMaisNova);
    }
}