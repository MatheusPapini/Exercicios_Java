package logica_programacao;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Número de faltas do aluno: ");
        int faltas = entrada.nextInt();

        if (faltas > 15)
            System.out.println("Aluno reprovado por falta.");
        else
            System.out.println("Aluno não reprovado por falta.");
    }
}