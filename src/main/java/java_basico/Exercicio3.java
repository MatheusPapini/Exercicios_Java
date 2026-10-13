package java_basico;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        double saldo;
        double reajuste;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o saldo: ");
        saldo = entrada.nextDouble();

        reajuste = saldo * 1.01;
        System.out.printf("Saldo após reajuste de 1%%: R$ " + reajuste);
    }
}
