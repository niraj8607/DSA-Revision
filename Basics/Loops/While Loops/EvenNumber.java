// Input a number N and print all even numbers from 1 to N using a while loop.
import java.util.*;
public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int counter = 1;
        while (counter <= n) {
            if(counter % 2 == 0){
                System.out.print(counter +" ,");
            }
            counter++;
        }
        sc.close();
    }
}
