import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int orgn = n;
        int count = 0;
        //step1 : Count the digits
        while (n > 0) {
            n = n/10;
            count++;
        }

        //steps2: Calculate the armstrong sum
        n = orgn;
        double sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum =  sum + Math.pow(digit, count);
            n = n /10;

        }
        //step3: Compare the original number and sum 
        if (sum == orgn) {
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
        sc.close();

        
    }
}
