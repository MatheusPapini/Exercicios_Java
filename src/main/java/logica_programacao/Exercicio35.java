package logica_programacao;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = entrada.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double n3 = entrada.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.println("Média: " + media);

        if (media >= 7)
            System.out.println("Aprovado!");
        else
            System.out.println("Reprovado!");
    }
}