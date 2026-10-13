package logica_programacao;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do mês (ex: janeiro): ");
        String mes = entrada.nextLine().toLowerCase();

        switch (mes) {
            case "janeiro": case "março": case "maio": case "julho":
            case "agosto": case "outubro": case "dezembro":
                System.out.println("O mês tem 31 dias.");
                break;
            case "abril": case "junho": case "setembro": case "novembro":
                System.out.println("O mês tem 30 dias.");
                break;
            case "fevereiro":
                System.out.println("O mês tem 28 ou 29 dias.");
                break;
            default:
                System.out.println("Mês inválido.");
        }
    }
}