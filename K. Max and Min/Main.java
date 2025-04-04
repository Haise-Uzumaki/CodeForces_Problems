import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int minimum = Math.min(A, Math.min(B, C));
        int maximum = Math.max(A, Math.max(B, C));

        System.out.println(minimum + " " + maximum);

        scanner.close();
    }
}