package comando_repeticao;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contagem = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número: ");
            int num = entrada.nextInt();
            if (num > 8) {
                contagem++;
            }
        }
        System.out.println("Números maiores que 8: " + contagem);
    }
}