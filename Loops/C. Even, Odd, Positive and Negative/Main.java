import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int N = scanner.nextInt();
        
       
        int even = 0, odd = 0, positive = 0, negative = 0;
        
       
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            
         
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            
          
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            }
        }
        
      
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        
        scanner.close();
    }
}