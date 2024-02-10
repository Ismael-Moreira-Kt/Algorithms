/* 
    Write an algorithm that reads
    an integer and displays a 
    message indicating whether this
    number is even or odd, and whether
    it is positive or negative.
*/

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int a = scan.nextInt();

        if ((a > 0) && (a % 2 == 0)){
            System.out.println("Positive pair");
        } else if ((a < 0) && (a % 2 == 0)){
            System.out.println("Negative pair");
        } else if ((a > 0) && (a % 2 != 0)){
            System.out.println("Odd positive");
        } else {
            System.out.println("Odd negative");
        }

        scan.close();
    }
}