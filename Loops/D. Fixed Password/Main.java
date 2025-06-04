import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        int correctPass = 1999;

        while(scanner.hasNextInt()){
            int password = scanner.nextInt();
            if(password==correctPass){
                System.out.println("Correct");
                break;
            }
            else{
                System.out.println("Wrong");
            }
        }
        
        scanner.close();
    }
}