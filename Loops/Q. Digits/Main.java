import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int T = scanner.nextInt();
        
   
        while (T-- > 0) {
     
            String N = scanner.next();
            
         
            for (int i = N.length() - 1; i >= 0; i--) {
                System.out.print(N.charAt(i));
              
                if (i > 0) {
                    System.out.print(" ");
                }
            }
        
            System.out.println();
        }
        
        scanner.close();
    }
}