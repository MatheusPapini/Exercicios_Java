package programacao_java;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = entrada.nextInt();
            soma += numero;
        }

        System.out.println("Soma dos números: " + soma);
    }
}