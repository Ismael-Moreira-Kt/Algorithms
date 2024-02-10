/* 
    Write an algorithm that reads:
        - the percentage of IPI to be added to the value of the pieces
        - part code 1, unit value of part 1, quantity of parts 1
        - part code 2, unit value of part 2, quantity of parts 2

    The algorithm must calculate the total amount to be paid and present the result.
        Formula: (value1*quant1 + value2*quant2)*(IPI/100 + 1)
*/


import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the IPI value: ");
        double ipi = scan.nextDouble();

        System.out.println("Enter the value of the product and how many units you want: ");
        int firstUnitaryValue = scan.nextInt();
        int firstQuantityPieces = scan.nextInt();

        System.out.println("Enter the value of the product and how many units you want: ");
        int secondUnitaryValue = scan.nextInt();
        int secondQuantityPieces = scan.nextInt();

        double payment = ((
            (firstQuantityPieces * firstUnitaryValue)
            +
            (secondQuantityPieces * secondUnitaryValue))
            /
            ((ipi/100)+1
        ));

        System.out.println("Payment: " + payment);
        scan.close();
    }
}