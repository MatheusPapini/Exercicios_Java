package repeticao_while;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número limite: ");
        int limite = leitor.nextInt();
        int a = 0, b = 1;

        System.out.println("Sequência de Fibonacci até " + limite + ":");
        while (a <= limite) {
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
