
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        long M = scanner.nextLong();

        scanner.close();

        int lastdigit = (int) (N % 10 + M % 10);
        System.out.println(lastdigit);
    }
}
