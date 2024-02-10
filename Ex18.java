/* 
    A bank will grant special credit to its customers, 
    which varies with the average balance over the last 
    year. Create an algorithm that reads a customer's 
    average balance and calculates the credit 
    amount according to the table below. Show a 
    message stating the average balance and credit amount.
        Average Percentage Balance
        from 0 to 200 no credit
        from 201 to 400 20% of the average balance value
        from 401 to 600 30% of the average balance value
        above 601 40% of the average balance value
*/

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double percentage;

        System.out.println("What is your average annual balance?");
        double averageBalance = scan.nextDouble();

        if (averageBalance <= 200){
            percentage = 0;
        } else if (averageBalance > 200 && averageBalance <= 400){
            percentage = .2;
        } else if (averageBalance > 400 && averageBalance <= 600){
            percentage = .3;
        } else {
            percentage = .4;
        }

        System.out.println("For your current average annual balance of" 
            + averageBalance + 
            ", the percentage you will be given is: " + percentage);

        scan.close();
    }
}