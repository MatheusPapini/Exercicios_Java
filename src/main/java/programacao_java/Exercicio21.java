package programacao_java;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = entrada.nextDouble();

        double valorPrestacao = valorCompra / 5;

        System.out.printf("Valor de cada prestação: R$ %.2f\n", valorPrestacao);
    }
}