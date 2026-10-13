package programacao_java;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int somaIdades = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = entrada.nextInt();
            somaIdades += idade;
        }

        System.out.println("Soma das idades: " + somaIdades);
    }
}