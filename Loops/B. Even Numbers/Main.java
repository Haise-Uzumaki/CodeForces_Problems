import java.util.Scanner;

public class Main{
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        boolean hasEven = false;

        for(int i=2; i<=a; i+=2){

            System.out.println(i);
            hasEven = true;

         }

         if(hasEven != true){
            System.out.println(-1);
         }

    }
}