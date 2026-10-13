package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int positivos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            int num = entrada.nextInt();
            if (num > 0) positivos++;
        }

        System.out.println("Quantidade de positivos: " + positivos);
    }
}