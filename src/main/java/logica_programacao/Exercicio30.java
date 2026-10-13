package logica_programacao;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantidade de maçãs compradas: ");
        int quantidade = entrada.nextInt();

        double precoPorUnidade = quantidade >= 12 ? 0.40 : 0.50;
        double total = quantidade * precoPorUnidade;

        System.out.println("Valor total: R$ " + total);
    }
}