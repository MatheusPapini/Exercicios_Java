package programacao_java;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int somaIdades = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = entrada.nextInt();
            somaIdades += idade;
        }

        double mediaIdades = (double) somaIdades / 20;

        System.out.printf("Média das idades: %.2f\n", mediaIdades);
    }
}