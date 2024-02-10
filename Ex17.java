/* 
    Taking as input data a person's height 
    and sex (?M? male and ?F? female), build 
    an algorithm that calculates their ideal 
    weight, using the following formulas:

    - for men: (72.7*h)-58
    - for women: (62.1*h)-44.7
*/


import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double idealWeight;

        System.out.println("You are male or female? (M/F)");
        char gender = scan.next().charAt(0);
        gender = Character.toLowerCase(gender);

        System.out.println("What is your height: ");
        double height = scan.nextDouble();

        if (gender == 'f') {
            idealWeight = (62.1 * height) - 44.7; 
        } else {
            idealWeight = (72.7 * height) - 58;
        }

        System.out.println("Your ideal weight is " + idealWeight);
    }
}