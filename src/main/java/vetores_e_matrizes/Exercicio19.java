package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] a = new int[2][2], b = new int[2][2], soma = new int[2][2];

        System.out.println("Matriz A:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = entrada.nextInt();
            }

        System.out.println("Matriz B:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                System.out.print("b[" + i + "][" + j + "] = ");
                b[i][j] = entrada.nextInt();
            }

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                soma[i][j] = a[i][j] + b[i][j];

        System.out.println("Soma das matrizes:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }
    }
}