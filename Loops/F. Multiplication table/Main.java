import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for(int i = 1; i<=12; i++){
           
            int b  = a*i;
            System.out.println(a+ " * " + i + " = " + b);
        }
    }
}