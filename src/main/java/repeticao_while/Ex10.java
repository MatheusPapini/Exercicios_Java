package repeticao_while;

public class Ex10 {
    public static void main(String[] args) {
        int n = 20, a = 0, b = 1, count = 0;
        System.out.println("Primeiros " + n + " números da sequência de Fibonacci:");
        while (count < n) {
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
            count++;
        }
    }
}
