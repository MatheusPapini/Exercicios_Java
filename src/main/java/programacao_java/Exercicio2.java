package programacao_java;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        if (numero % 10 == 0) {
            System.out.println("O número é divisível por 10.");
        } else if (numero % 5 == 0) {
            System.out.println("O número é divisível por 5.");
        } else if (numero % 2 == 0) {
            System.out.println("O número é divisível por 2.");
        } else {
            System.out.println("O número não é divisível por 10, 5 nem 2.");
        }
    }
}