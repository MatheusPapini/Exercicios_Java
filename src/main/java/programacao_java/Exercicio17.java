package programacao_java;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contadorMaiores = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = entrada.nextInt();
            if (idade >= 18) {
                contadorMaiores++;
            }
        }

        System.out.println("Número de pessoas maiores de idade: " + contadorMaiores);
    }
}