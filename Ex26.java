/* 
    Write an algorithm that reads a value in 
    reais and calculates the smallest possible 
    number of notes of 100, 50, 10, 5 and 1 
    into which the read value can be decomposed. 
    Write the value read and the list of notes required.
*/

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hundreds = 0, fifty = 0, dozens = 0, five = 0, one = 0;

        System.out.println("Enter a number: ");
        int value = scan.nextInt();

        while (value > 0) {
            if (value >= 100) {
                hundreds += 1;
                value -= 100;
            } else if (value >= 50) {
                fifty += 1;
                value -= 50;
            } else if (value >= 10) {
                dozens += 1;
                value -= 10;
            } else if (value >= 5){
                five += 1;
                value -= 5;
            } else {
                one += 1;
                value -= 1;
            }
        }

        System.out.println("hundred notes: " + hundreds);
        System.out.println("fifty notes: " + fifty);
        System.out.println("ten notes: " + dozens);
        System.out.println("fiver notes: " + five);
        System.out.println("one notes: " + one);

        scan.close();
    }    
}