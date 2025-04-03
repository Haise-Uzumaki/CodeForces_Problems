import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        double x;
        double y;
        double result1;
        double result2;
        double result3;

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        y = scanner.nextDouble();

        result1 = x + y;
        result2 = x * y;
        result3 = x - y;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
