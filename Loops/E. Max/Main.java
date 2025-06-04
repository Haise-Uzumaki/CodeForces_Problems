import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        long max = Long.MIN_VALUE;

        for(int i = 0; i < N; i++){
            long num = scanner.nextLong();
            if(num > max){
                max = num;
            }
        }

        System.out.println(max);

        scanner.close();
    }
}