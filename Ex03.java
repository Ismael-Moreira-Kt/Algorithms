/*
    Make an algorithm that reads a 
    person's age expressed in years, 
    months and days and shows it 
    expressed in days only.
*/

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int years, month, days, age;

        System.out.println("How old are you, months and days? (Separate with enter)");
        years = scan.nextInt();
        month = scan.nextInt();
        days = scan.nextInt();
 
        age = days + (month * 30) + (years * 365);
        System.out.println("In days, you currently have: " + age);

        scan.close();
    }   
}