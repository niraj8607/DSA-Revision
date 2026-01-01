//Take a number and calculate the sum of its digits
import java.util.*;

public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int sum = 0;
        while (number > 0) {
            int LastDigit = number % 10;
            sum = sum + LastDigit;
            number = number /10;
        }
        System.out.println(sum);
        sc.close();
    }
}
