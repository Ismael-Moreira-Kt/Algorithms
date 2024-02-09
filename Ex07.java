/*
    The consumer cost of a new car
    is the sum of the factory cost
    plus the distributor's percentage
    and taxes (applied to the factory cost).
    Assuming that the distributor's 
    percentage is 28% and taxes are 45%, 
    write an algorithm that reads the factory 
    cost of a car and writes the cost to the consumer.
*/

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double factoryCost, costConsumer;

        System.out.println("Enter the factory cost.");
        factoryCost = scan.nextDouble();

        costConsumer = factoryCost + (factoryCost * .28 * .45);
        System.out.println("The car will cost " + costConsumer + " to the consumer.");

        scan.close();
    }    
}