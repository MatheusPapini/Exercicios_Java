package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Números pares:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            int num = entrada.nextInt();
            if (num % 2 == 0) System.out.println(num);
        }
    }
}