/* 
    Create an algorithm that reads 2 values
    ​​a and b and writes them with the message:
    "They are multiples" or "They are not multiples".
*/

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Enter two numbers:");
        a = scan.nextInt();
        b = scan.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("There are multiple.");
        } else {
            System.out.println("There aren't multiple.");
        }

        scan.close();        
    }
}