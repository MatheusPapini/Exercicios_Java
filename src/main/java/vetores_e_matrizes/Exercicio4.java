package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sentrada = new Scanner(System.in);
        int pares = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            int num = sentrada.nextInt();
            if (num % 2 == 0) pares++;
        }

        System.out.println("Quantidade de pares: " + pares);
    }
}