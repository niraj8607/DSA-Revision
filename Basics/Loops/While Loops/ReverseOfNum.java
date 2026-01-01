import java.util.*;
public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int rev = 0;
        while (number > 0) {
            int LastDigit = number % 10;
            rev = rev * 10 + LastDigit;
            number = number /10;
        }
        System.out.print(rev);
        sc.close();
    }
}
