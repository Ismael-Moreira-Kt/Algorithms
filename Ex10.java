/* 
    Create an algorithm that reads 3
    values ​​a,b,c and writes them. 
    Next, find the largest of the 3 
    values ​​and write it with the 
    message: "It is the largest".
*/

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c, bigger;

        System.out.println("Enter 3 integers.");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        System.out.println(a + " | " + b + " | " + c);

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