//Take input N and find the sum of first N natural numbers using a while loop.
import java.util.*;
public class SumOfN {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    int counter = 0;
    int sum = 0; 
    while (counter <= n) {
        sum = sum + counter;
        counter++;
    }
    System.out.println("The sum is: "+sum);
    sc.close();
   }
}
