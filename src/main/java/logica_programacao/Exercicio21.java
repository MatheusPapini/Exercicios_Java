package logica_programacao;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int maiores = 0, menores = 0;
        char continuar;

        do {
            System.out.print("Digite a idade da pessoa: ");
            int idade = entrada.nextInt();

            if (idade >= 18)
                maiores++;
            else
                menores++;

            System.out.print("Deseja continuar? (S/N): ");
            continuar = entrada.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        System.out.println("Maiores de idade: " + maiores);
        System.out.println("Menores de idade: " + menores);
    }
}