package repeticao_for;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o limite para a sequência de Fibonacci: ");
        int limite = leitor.nextInt();

        int a = 0, b = 1;

        System.out.print("Sequência de Fibonacci até " + limite + ": ");

        while (a <= limite) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
