package programacao_java;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador0a100 = 0;
        int contador101a200 = 0;
        int contadorAcima200 = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = entrada.nextInt();

            if (numero >= 0 && numero <= 100) {
                contador0a100++;
            } else if (numero >= 101 && numero <= 200) {
                contador101a200++;
            } else {
                contadorAcima200++;
            }
        }

        System.out.println("Números entre 0 e 100: " + contador0a100);
        System.out.println("Números entre 101 e 200: " + contador101a200);
        System.out.println("Números maiores que 200: " + contadorAcima200);
    }
}