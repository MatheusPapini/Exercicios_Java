package programacao_java;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = entrada.nextInt();
            if (numero >= 0 && numero <= 100) {
                contador++;
            }
        }

        System.out.println("Quantidade de números entre 0 e 100: " + contador);

        entrada.close();
    }
}