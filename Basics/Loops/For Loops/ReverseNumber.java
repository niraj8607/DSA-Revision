import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        for(; n>0; n = n/10){
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
        }
        System.out.println(rev);
        sc.close();
    }
}
