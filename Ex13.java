/* 
    Write an algorithm that reads 3 
    integers and outputs the largest one.
*/

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c, bigger;

        System.out.println("Enter 3 integers.");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if (a > b && a > c) {
            bigger = a;
        } else if ( b > c ) {
            bigger = b;
        } else {
            bigger = c;
        }

        System.out.println("The largest number is " + bigger);

        scan.close();
    }
}