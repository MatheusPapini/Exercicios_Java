package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean temZero = false;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            if (entrada.nextInt() == 0) temZero = true;
        }

        System.out.println(temZero ? "Há zero." : "Não há zero.");
    }
}