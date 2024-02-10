/* 
    Write an algorithm that reads the identification number, 
    the 3 marks obtained by a student in the 3 checks and 
    the average of the exercises that are part of the assessment. 
    Calculate the average performance using the formula:

        MA = (Note1 + Note2 x 2 + Note3 x 3 + ME )/7

        The attribution of concepts follows the table below:
        Average Utilization | Concept
        9.0 | A
        7.5 and < 9.0 | B
        6.0 and < 7.5 | C
        4.0 and < 6.0 | D
        < 4.0 | E

    The algorithm must write the student's number, their grades, 
    the average of the exercises, the average performance, 
    the corresponding concept and the message: APPROVED if the 
    concept is A, B or C and FAIL if the concept is D or E.
*/

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your student number: ");
        int id = scan.nextInt();

        System.out.println("Enter the three notes: ");
        int note1 = scan.nextInt();
        int note2 = scan.nextInt();
        int note3 = scan.nextInt();

        System.out.println("Enter the average exercises: ");
        double me = scan.nextDouble();

        double ma = (
            (note1 + (note2 * 2) + (note3 * 3) + me)
            / 7
        );

        System.out.println("STUDENT NUMBER: " + id);
        System.out.println("NOTES: " + note1 + " | " + note2 + " | " + note3);
        System.out.println("AVERAGE PERFORMANCE: " + ma);
        System.out.println("EXERCISE AVERAGE: " + me);

        if (ma >= 9) {
            System.out.println("CONCEPT: A");
            System.out.println("APPROVED");
        } else if (ma >= 7.5 && ma < 9) {
            System.out.println("CONCEPT: B");
            System.out.println("APPROVED");
        } else if (ma >= 6 && ma < 7.5) {
            System.out.println("CONCEPT: C");
            System.out.println("APPROVED");
        } else if (ma >= 4 && ma < 6) {
            System.out.println("CONCEPT: D");
            System.out.println("DISAPPROVED");
        } else {
            System.out.println("CONCEPT: E");
            System.out.println("DISAPPROVED");
        }

        scan.close();
    }
}