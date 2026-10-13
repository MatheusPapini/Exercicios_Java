package programacao_java;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o saldo: ");
        double saldo = entrada.nextDouble();

        double reajuste = saldo * 0.015;
        double novoSaldo = saldo + reajuste;

        System.out.printf("Saldo com reajuste: R$ %.2f\n", novoSaldo);
    }
}