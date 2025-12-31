//Write a program that takes an integer and checks whether the number is positive, negative, or zero.
import java.util.*;
public class PossAndNeg{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number: ");
      int n = sc.nextInt();
      if(n == 0){
        System.out.println("Number is zero : " + n);
      }else if(n > 0){
        System.out.println("Number is positive: "+n);
      }else{
        System.out.println("Number is negative");
      }
      sc.close();
    }
}

