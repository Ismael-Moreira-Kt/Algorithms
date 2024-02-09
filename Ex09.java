/* 
    Calculate the arithmetic average of a
    student's 3 grades and show, in addition
    to the average value, a "Passed" message
    if the average is equal to or greater
    than 6, or a "Failed" message otherwise.
*/

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double note1, note2, note3;


        System.out.println("Enter 3 notes: ");
        note1 = scan.nextDouble();
        note2 = scan.nextDouble();
        note3 = scan.nextDouble();

        if (((note1 + note2 + note3 )/3) >= 6) {
            System.out.println("Approved!");
        } else {
            System.out.println("Disapproved!");
        }

        scan.close();
    }   
}