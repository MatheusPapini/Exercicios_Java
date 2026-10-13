package logica_programacao;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double n1 = entrada.nextDouble();

        System.out.print("Nota 2: ");
        double n2 = entrada.nextDouble();

        System.out.print("Nota 3: ");
        double n3 = entrada.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        if (media >= 7)
            System.out.println("Aluno aprovado. Média: " + media);
        else
            System.out.println("Aluno reprovado. Média: " + media);
    }
}