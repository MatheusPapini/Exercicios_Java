package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] mat = new int[4][4];
        int soma = 0;

        System.out.println("Digite os elementos da matriz 4x4:");

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++) {
                System.out.print("mat[" + i + "][" + j + "] = ");
                mat[i][j] = entrada.nextInt();
                soma += mat[i][j];
            }

        double media = (double) soma / 16;
        System.out.println("Média dos elementos: " + media);
    }
}