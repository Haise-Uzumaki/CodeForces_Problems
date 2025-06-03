import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        scanner.close();

        int a = 0, b = 0;
        char op = ' ';

        if(expression.contains("+")){
            op = '+';
        }
        else if(expression.contains("-")){
            op = '-';
        }
        else if(expression.contains("*")){
            op = '*';
        }
        else if(expression.contains("/")){
            op = '/';
        }

        String[] parts = expression.split("\\" + op);
        a = Integer.parseInt(parts[0]);
        b = Integer.parseInt(parts[1]);

        if(op == '+'){
            System.out.println(a+b);
        }
        else if(op == '-'){
            System.out.println(a-b);
        }
        else if(op == '*'){
            System.out.println(a*b);
        }
        else if(op == '/'){
            System.out.println(a/b);
        }
    }
}