
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero para verificar se pertence a sequencia de Fibonacci: ");
        int n = scanner.nextInt();
        scanner.close();

        if (verificaFibonacci(n)) {
            System.out.println("Pertence a sequencia de Fibonacci ");
        } else {
            System.out.println("NAO pertence a sequencia de Fibonacci ");
        }

    }

    public static boolean verificaFibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        while (c < n) {
            c = a + b;
            a = b;
            b = c;
        }
        if (c == n) {
            return true;
        } else {
            return false;
        }
    }

} 
