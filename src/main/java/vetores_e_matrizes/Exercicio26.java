package vetores_e_matrizes;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] a = new int[2][2], b = new int[2][2];
        boolean iguais = true;

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
                if (a[i][j] != b[i][j]) {
                    iguais = false;
                    break;
                }
        System.out.println(iguais ? "As matrizes são iguais." : "As matrizes não são iguais.");
    }
}