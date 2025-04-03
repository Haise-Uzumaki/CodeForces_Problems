import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        long x;
        long y;
        long result1;
        long result2;
        long result3;

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextLong();
        y = scanner.nextLong();

        result1 = x + y;
        result2 = x * y;
        result3 = x - y;

        System.out.println(x +" + "+ y +" = " + result1);
        System.out.println(x +" * "+ y +" = " + result2);
        System.out.println(x +" - "+ y +" = " + result3);

    }
}
