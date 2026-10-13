package logica_programacao;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = entrada.nextLine();

        System.out.print("Turno (M/V): ");
        char turno = entrada.nextLine().toUpperCase().charAt(0);

        if (turno == 'M')
            System.out.println("Bom dia, " + nome);
        else if (turno == 'V')
            System.out.println("Boa tarde, " + nome);
        else
            System.out.println("Turno inválido.");
    }
}