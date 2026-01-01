
// Input an integer and count how many digits it has using a while loop.
import java.util.*;
public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int count = 0;
        while (number > 0) {
            number = number /10;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
