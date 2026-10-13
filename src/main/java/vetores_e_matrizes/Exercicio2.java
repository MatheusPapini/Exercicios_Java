package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            soma += entrada.nextInt();
        }

        System.out.println("Soma total: " + soma);
    }
}