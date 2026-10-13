package programacao_java;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar (R$/US$): ");
        double cotacaoDolar = entrada.nextDouble();
        System.out.print("Digite a quantidade de dólares: ");
        double quantidadeDolares = entrada.nextDouble();

        double valorReais = cotacaoDolar * quantidadeDolares;

        System.out.printf("Valor em reais: R$ %.2f\n", valorReais);
    }
}