//Input an integer and determine whether it is even or odd using conditional statements.
import java.util.*;
public class EvenOrOdd {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   if(n %2 == 0){
    System.out.println("Even number");
   }else{
    System.out.println("Odd number");
   }
   sc.close();
   
   }
}
