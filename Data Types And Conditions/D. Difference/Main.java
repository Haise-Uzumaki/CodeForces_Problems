
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        long A;
        long B;
        long C;
        long D;
        long X;

        Scanner scanner = new Scanner(System.in);
        A = scanner.nextLong();
        B = scanner.nextLong();
        C = scanner.nextLong();
        D = scanner.nextLong();

        X = (A * B) - (C * D);
        System.out.println("Difference = " + X);

    }
}
