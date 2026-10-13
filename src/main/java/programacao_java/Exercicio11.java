package programacao_java;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nome = entrada.nextLine();
        System.out.print("Digite o salário fixo: ");
        double salarioFixo = entrada.nextDouble();
        System.out.print("Digite o total de vendas no mês: ");
        double totalVendas = entrada.nextDouble();

        double comissao = totalVendas * 0.15;

        double salarioFinal = salarioFixo + comissao;

        System.out.println("Nome: " + nome);
        System.out.println("Salário fixo: R$ " + salarioFixo);
        System.out.println("Salário final: R$ " + salarioFinal);
    }
}
