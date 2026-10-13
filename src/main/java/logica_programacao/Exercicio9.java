package logica_programacao;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Depósito mensal: ");
        double deposito = entrada.nextDouble();

        System.out.print("Taxa de juros mensal (%): ");
        double taxa = entrada.nextDouble() / 100;

        double montante = 0;

        for (int i = 1; i <= 12; i++) {
            montante += deposito;
            montante += montante * taxa;
        }

        System.out.println("Montante após 12 meses: R$ " + montante);
    }
}