//Grade System
// Input marks (0–100) and print grade:

// 90–100 → A

// 75–89 → B

// 60–74 → C

// 40–59 → D

// Below 40 → Fail

import java.util.*;
public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();
        if(marks >=90 && marks <= 100){
            System.out.println("Grade: A");
        }else if(marks >= 75 && marks <=89){
            System.out.println("Grade: B");
        }else if(marks >=60 && marks <= 74){
            System.out.println("Grade: C");
        }else if(marks >= 40 && marks <=59){
            System.out.println("Grade: D");
        }else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
