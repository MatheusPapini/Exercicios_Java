package vetores_e_matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome " + (i+1) + ": ");
            nomes[i] = entrada.nextLine();
        }

        Arrays.sort(nomes);
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) System.out.println(nome);
    }
}