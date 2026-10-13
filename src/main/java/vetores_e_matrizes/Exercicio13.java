package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            int num = entrada.nextInt();
            if (num >= 10 && num <= 50) cont++;
        }

        System.out.println("Quantidade entre 10 e 50: " + cont);
    }
}