package comando_repeticao;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double soma = 0;

        while (true) {
            System.out.print("Digite um número: ");
            double num = entrada.nextDouble();
            if (num < 0) break;
            soma += num;
        }
        System.out.println("Soma dos números positivos: " + soma);
    }
}