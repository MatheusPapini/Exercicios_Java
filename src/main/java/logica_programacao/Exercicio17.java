package logica_programacao;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        if (idade < 13)
            System.out.println("Você é uma criança.");
        else if (idade < 18)
            System.out.println("Você é um adolescente.");
        else if (idade < 60)
            System.out.println("Você é um adulto.");
        else
            System.out.println("Você é idoso.");
    }
}