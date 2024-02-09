/*
    Create an algorithm that reads
    a student's 3 grades and 
    calculates this student's
    final average. Consider that 
    the average is weighted and 
    that the weight of the grades 
    is: 2,3 and 5, respectively.
*/

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grades, grades2, grades3, average;
        
        System.out.println("Type the three notes (separated by enter)");

        grades = scan.nextDouble();
        grades2 = scan.nextDouble();
        grades3 = scan.nextDouble();

        average = (grades * .2) + (grades2 * .3) + (grades3 * .5);

        System.out.println("The average of the three grades entered is " + average);
        scan.close();
    }   
}