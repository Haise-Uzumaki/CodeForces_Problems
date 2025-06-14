import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        long n = scanner.nextLong();
        
        
        String reversed = reverseNumber(n);
        
     
        String original = String.valueOf(n);
        boolean isPalindrome = original.equals(reversed);
        
       
        System.out.println(reversed);
        System.out.println(isPalindrome ? "YES" : "NO");
        
        scanner.close();
    }
    
    private static String reverseNumber(long n) {
       
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.reverse();
        
       
        int start = 0;
        while (start < sb.length() && sb.charAt(start) == '0') {
            start++;
        }
        
        
        if (start == sb.length()) {
            return "0";
        }
        
        return sb.substring(start);
    }
}