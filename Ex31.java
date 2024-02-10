/* 
    Write an algorithm that calculates the successive 
    values ​​of E using the series below and considering 
    first 3 terms, then 4 terms and, finally, 5 terms:

    E = 1 + 1 / 1! + 1/2! + 1/3! + 1/4!
*/

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int numTerms = scan.nextInt();

        double e = 1.0;
        double termCurrent = 1.0;

        for (int i = 1; i <= numTerms; i++) {
            termCurrent /= i;
            e += termCurrent;
        }

        System.out.println("The value of E with " + numTerms + " terms is: " + e);

        scan.close();
    }
}