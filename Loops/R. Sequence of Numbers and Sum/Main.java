import java.util.Scanner;

public class Main{
    public static void main(String[] args){


       Scanner scanner = new Scanner(System.in);
       while (true) {
          
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            
           
            if (N <= 0 || M <= 0) {
                break;
            }
            
            
            int start = Math.min(N, M);
            int end = Math.max(N, M);
            
           
            long sum = 0;
            for (int i = start; i <= end; i++) {
                System.out.print(i);
                sum += i;
              
                if (i < end) {
                    System.out.print(" ");
                }
            }
            
          
            System.out.println(" sum =" + sum);
        }
        
        scanner.close();
    }
}