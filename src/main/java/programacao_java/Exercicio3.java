package programacao_java;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o saldo médio: ");
        double saldoMedio = entrada.nextDouble();

        double credito = 0;
        if (saldoMedio >= 0 && saldoMedio <= 500) {
            credito = 0; // Nenhum crédito
        } else if (saldoMedio > 500 && saldoMedio <= 1000) {
            credito = saldoMedio * 0.3; // 30% do saldo médio
        } else if (saldoMedio > 1000 && saldoMedio <= 3000) {
            credito = saldoMedio * 0.4; // 40% do saldo médio
        } else {
            credito = saldoMedio * 0.5; // 50% do saldo médio
        }

        System.out.printf("Saldo médio: R$ %.2f\n", saldoMedio);
        System.out.printf("Valor do crédito: R$ %.2f\n", credito);
    }
}