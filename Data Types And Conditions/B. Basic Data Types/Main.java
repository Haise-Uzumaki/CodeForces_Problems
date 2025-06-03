import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int a;
        long b;
        char c;
        float d;
        double e;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextLong();
        c = scanner.next().charAt(0);
        d = scanner.nextFloat();
        e = scanner.nextDouble();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}