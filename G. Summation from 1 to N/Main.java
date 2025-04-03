import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        long a;

        a = scanner.nextLong();

        long result = (a * (a + 1) )/ 2;

        System.out.println(result);


        scanner.close();


    }


}
