/* 
    Create an algorithm that, given a 
    swimmer's age, classifies him 
    into one of the following categories:
 
        child A = 5 - 7 years
        child B = 8-10 years
        juvenile A = 11-13 years
        juvenile B = 14-17 years old
        adult = over 18 years old
*/

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        if (age >= 5 && age <= 7) {
            System.out.println("Children's A");
        } else if (age >= 8 && age <= 10) {
            System.out.println("Children's B");
        } else if (age >= 11 && age <= 13) {
            System.out.println("Juvenile A");
        } else if (age >= 14 && age <= 17) {
            System.out.println("Juvenile B");
        } else if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Baby");
        }

        scan.close();
    }
}