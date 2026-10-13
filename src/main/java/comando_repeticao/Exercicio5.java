package comando_repeticao;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            double numero = entrada.nextDouble();
            soma += numero;
        }
        System.out.println("Soma dos números: " + soma);
    }
}