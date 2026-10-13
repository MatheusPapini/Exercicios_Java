package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] mat = new int[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("mat[" + i + "][" + j + "] = ");
                mat[i][j] = entrada.nextInt();
            }

        boolean identidade = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && mat[i][j] != 1) identidade = false;
                if (i != j && mat[i][j] != 0) identidade = false;
            }
        }

        System.out.println(identidade ? "É matriz identidade." : "Não é matriz identidade.");
    }
}