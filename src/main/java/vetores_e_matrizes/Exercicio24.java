package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] mat = new int[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                System.out.print("mat[" + i + "][" + j + "] = ");
                mat[i][j] = entrada.nextInt();
            }

        boolean simetrica = true;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (mat[i][j] != mat[j][i]) {
                    simetrica = false;
                    break;
                }

        System.out.println(simetrica ? "É simétrica." : "Não é simétrica.");
    }
}