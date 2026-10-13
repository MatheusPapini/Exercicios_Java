package programacao_java;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contadorMaioresQue8 = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = entrada.nextInt();
            if (numero > 8) {
                contadorMaioresQue8++;
            }
        }

        System.out.println("Quantidade de números maiores que 8: " + contadorMaioresQue8);
    }
}