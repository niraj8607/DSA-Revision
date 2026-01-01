import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int originalNum = n;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n %10;
            rev = rev * 10 +lastDigit;
            n = n /10;
        }
        if(originalNum == rev){
            System.out.println("Number is Palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
        sc.close();
    }
}
