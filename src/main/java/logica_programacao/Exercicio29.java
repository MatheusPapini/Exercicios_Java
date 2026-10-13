package logica_programacao;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = entrada.nextLine();

        System.out.print("Nota do aluno: ");
        double nota = entrada.nextDouble();

        if (nota >= 7)
            System.out.println(nome + " está aprovado.");
        else
            System.out.println(nome + " está em recuperação.");
    }
}