
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        double R;
        
        double pie;

        pie = 3.141592653;

        Scanner scanner = new Scanner(System.in);

        R = scanner.nextDouble();

        double area = pie * (R*R);

        System.out.printf("%.9f%n",area);

    }
}
