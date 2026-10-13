package repeticao_do_while;

public class Ex10 {
    public static void main(String[] args) {
        int a = 0, b = 1, count = 0;

        do {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        } while (count < 20);
    }
}
