package programacao_java;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite números (digite um número negativo para encerrar):");

        while (true) {
            int numero = entrada.nextInt();
            if (numero < 0) {
                break;
            }
            soma += numero;
        }

        System.out.println("Soma dos números digitados: " + soma);
    }
}