package logica_programacao;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Preço do produto: ");
        double preco = entrada.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = entrada.nextInt();

        double total = preco * quantidade;

        if (quantidade > 10) {
            total -= total * 0.10;
            System.out.println("Desconto aplicado de 10%.");
        }

        System.out.println("Valor total: R$ " + total);
    }
}