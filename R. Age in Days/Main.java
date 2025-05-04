import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        scanner.close();

        int year = a/365;
        int remain = a%365;

        int month = remain/30;
        int day = remain%30;

        System.out.println(year+" years");
        System.out.println(month+" months");
        System.out.println(day+" days");
    }
}