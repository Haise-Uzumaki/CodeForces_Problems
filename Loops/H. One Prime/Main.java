import java.util.Scanner;


public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

    
        
        if (isPrime(a)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static boolean isPrime(int num) {
        
        if (num < 2) {
            return false;
        }
        
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
}