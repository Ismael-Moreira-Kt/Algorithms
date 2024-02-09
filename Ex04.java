/*
    Make an algorithm that reads a person's
    age expressed in days and displays it
    expressed in years, months and days.
*/

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int years = 0, months = 0, days = 0, age;
            
        System.out.println("Enter your age in days: ");
        age = scan.nextInt();

        while(age > 0){
            if (age >= 365) {
                age -= 365;
                years += 1;
            } else if (age >= 30) {
                age -= 30;
                months += 1;
            } else {
                days = age;
                age = 0;
            }
        }

        System.out.println("Currently you have");
        System.out.println(years + " years.");
        System.out.println(months + " months.");
        System.out.println(days + " days.");

        scan.close();

    }
}