import java.util.*;
public class GCD {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();
            System.out.print("Enter the second number: ");
            int b = sc.nextInt();
    
            int originalA = a;
            int originalB = b;
    
            while(b != 0){
                int temp = b;
                b = a % b;
                a = temp;
            }
    
            int gcd = a;
            int lcm = (originalA * originalB) / gcd;
    
            System.out.println("HCF of the number is: " + gcd);
            System.out.println("LCM of the number is: " + lcm);
            sc.close();
        }
        
}
