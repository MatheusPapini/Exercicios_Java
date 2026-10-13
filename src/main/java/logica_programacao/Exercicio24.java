package logica_programacao;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = entrada.nextInt();

        // Ordenando os números
        if (a > b) { int temp = a; a = b; b = temp; }
        if (b > c) { int temp = b; b = c; c = temp; }
        if (a > b) { int temp = a; a = b; b = temp; }

        System.out.println("Números em ordem crescente: " + a + ", " + b + ", " + c);
    }
}