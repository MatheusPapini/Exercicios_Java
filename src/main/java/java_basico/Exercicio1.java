package java_basico;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        int anos;
        int meses;
        int dias;
        int totalDias;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a idade em anos: ");
        anos = entrada.nextInt();

        System.out.print("Digite a idade em meses: ");
        meses = entrada.nextInt();

        System.out.print("Digite a idade em dias: ");
        dias = entrada.nextInt();

        totalDias = anos * 365 + meses * 30 + dias;
        System.out.println("Total de dias vividos: " + totalDias + " dias");
    }
}