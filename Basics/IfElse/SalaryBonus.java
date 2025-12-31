// Salary Bonus
// Input employee salary:

// Salary ≥ 50,000 → 10% bonus

// Salary ≥ 30,000 → 7% bonus

// Salary ≥ 20,000 → 5% bonus

// Else → No bonus
import java.util.*;
public class SalaryBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the salary: ");
        int salary = sc.nextInt();
        double bonus = 0;
        double finalSalary = 0;
        if(salary >= 50000){
            bonus = salary * 0.10;
            finalSalary = salary + bonus;
        }else if(salary >=30000){
            bonus = salary * 0.07;
            finalSalary = salary + bonus;
        }else if(salary >= 20000){
            bonus = salary * 0.05;
            finalSalary = salary + bonus;
        }else{
            finalSalary = salary;
            System.out.println("No bonus");
        }
        System.out.println("Final Salary is:" + finalSalary);
        sc.close();
    }
}
