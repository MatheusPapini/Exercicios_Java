package repeticao_for;

public class E10 {
    public static void main(String[] args) {
        int a = 0, b = 1;

        System.out.println("Primeiros 20 números da sequência de Fibonacci:");

        for (int i = 0; i < 20; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
