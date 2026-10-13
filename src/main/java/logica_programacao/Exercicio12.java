package logica_programacao;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        double peso = entrada.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);
    }
}