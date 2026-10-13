package comando_repeticao;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maioresDeIdade = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a idade da pessoa " + (i+1) + ": ");
            int idade = entrada.nextInt();
            if (idade >= 18) {
                maioresDeIdade++;
            }
        }
        System.out.println("Quantidade de pessoas maiores de idade: " + maioresDeIdade);
    }
}