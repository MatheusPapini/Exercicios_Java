package repeticao_for;

import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = leitor.nextInt();

        num = Math.abs(num);

        if (num == 0) {
            System.out.println(0);
            return;
        }

        int temp = num;
        int invertido = 0;

        while (temp > 0) {
            invertido = invertido * 10 + (temp % 10);
            temp /= 10;
        }

        while (invertido > 0) {
            System.out.println(invertido % 10);
            invertido /= 10;
        }
    }
}
