/* 
    Write an algorithm that reads a 
    student's code and their three notes. 
    Calculate the student's weighted average, 
    considering that the weight for the 
    highest grade is 4 and for the remaining 
    two, 3. Show the student's code, their 
    three grades, the calculated average and 
    a "PASS" message if the average is 
    higher or equal to 5 and "FAIL" if the 
    average is less than 5.
*/


import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int code, grades, grades2, grades3; 
        double weightedAverage;

        System.out.println("Enter your student code: ");
        code = scan.nextInt();

        System.out.println("Type your school grades separately by pressing enter.");
        grades = scan.nextInt();
        grades2 = scan.nextInt();
        grades3 = scan.nextInt();

        weightedAverage = ((
            (grades * .4) + (grades2 * .3) + (grades3 * .3)
        ));

        System.out.println("Student code: " + code);
        System.out.println("First semester grade: " + grades);
        System.out.println("Second semester grade: " + grades2);
        System.out.println("Third semester grade: " + grades3);
        System.out.println("Average grade: " + weightedAverage);

        if (weightedAverage >= 5){
            System.out.println("Approved.");
        } else {
            System.out.println("Disapproved.");
        }

        scan.close();
    }
}