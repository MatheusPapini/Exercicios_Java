package comando_repeticao;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(nome);
        }
    }
}