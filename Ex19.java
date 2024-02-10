/* 
    A user wants an algorithm where they can 
    choose what type of average they want to 
    calculate from 3 scores. Create an algorithm 
    that reads the notes, the option chosen by 
    the user and calculates the average.

    1 -arithmetic
    2- weighted (3,3,4)
    3 -harmonic
*/

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int code, grades, grades2, grades3; 
        double average;

        System.out.println("Type your school grades separately by pressing enter.");
        grades = scan.nextInt();
        grades2 = scan.nextInt();
        grades3 = scan.nextInt();


        System.out.println("What type of average do you want to see?");
        System.out.println("1 - Arithmetic");
        System.out.println("2 - Weighted");
        System.out.println("3 - Harmonic");
        code = scan.nextInt();

        if (code == 1) {
            average = (grades + grades2 + grades3) / 3;
        } else if (code == 2) {
            average = ((grades * .3) + (grades2 * .3) + (grades3 * .4));
        } else {
            average = 3 / (
                (1 / grades) + (1 / grades2) + (1 / grades3)
            );
        }

        System.out.println(average);

        scan.close();
    }
}