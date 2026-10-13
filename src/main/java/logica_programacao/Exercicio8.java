package logica_programacao;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        int a = entrada.nextInt();

        System.out.print("Digite o valor B: ");
        int b = entrada.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Valores trocados:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}