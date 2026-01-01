import java.util.*;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // input number
        int count = 0;         // digit counter

        for (; n > 0; n = n / 10) {
            count++;
        }

        System.out.println(count);
        sc.close();
    }
}
