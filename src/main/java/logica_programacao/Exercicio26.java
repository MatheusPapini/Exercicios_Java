package logica_programacao;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o código do produto (1 a 5): ");
        int codigo = entrada.nextInt();

        System.out.print("Quantidade comprada: ");
        int quantidade = entrada.nextInt();

        double preco = 0;

        switch (codigo) {
            case 1: preco = 10.00; break;
            case 2: preco = 15.00; break;
            case 3: preco = 8.00; break;
            case 4: preco = 12.00; break;
            case 5: preco = 20.00; break;
            default:
                System.out.println("Código inválido.");
                return;
        }

        double total = preco * quantidade;
        System.out.println("Valor total: R$ " + total);
    }
}