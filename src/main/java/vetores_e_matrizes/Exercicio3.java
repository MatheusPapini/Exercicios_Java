package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double soma = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            soma += entrada.nextDouble();
        }

        double media = soma / 7;
        System.out.println("Média aritmética: " + media);
    }
}