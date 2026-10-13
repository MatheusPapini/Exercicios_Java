package comando_repeticao;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int pares = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número: ");
            int num = entrada.nextInt();
            if (num % 2 == 0) {
                pares++;
            }
        }
        System.out.println("Quantidade de números pares: " + pares);
    }
}