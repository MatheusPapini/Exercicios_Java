package comando_repeticao;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int somaIdades = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a idade da pessoa " + (i+1) + ": ");
            int idade = entrada.nextInt();
            somaIdades += idade;
        }
        double media = (double) somaIdades / 20;
        System.out.println("Média das idades: " + media);
    }
}