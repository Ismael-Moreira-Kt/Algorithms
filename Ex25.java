/* 
    Write an algorithm that reads a set of 4 values
    ​​i, a, b, c, where i is a positive integer value 
    and a, b, c, are any real values ​​and write them. 
    Next:
        a) If i=1 write the three values ​​
            a, b, c in ascending order.
        b) If i=2 write the three values 
            ​​a, b, c in descending order.
        c) If i=3 write the three values 
            ​​a, b, c so that the largest 
            of a, b, c is between the two.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 3 numbers: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        System.out.println("You want: \n" +
                        " 1 - See the values ​​in ascending order \n" +
                        " 2 - See the values ​​in descending order \n" +
                        " 3 - Write the three values ​​a, b, c so that the largest among a, b, c is among the two.");
        int i = scan.nextInt();

        Double[] arr = {a, b, c};
        Arrays.sort(arr);

        switch (i) {
            case 1:
                for (Double value : arr) {
                    System.out.println(value);
                }

                break;
        
            case 2:
                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.println(arr[j]);
                }

                break;

            case 3:
                System.out.println(arr[1] + " | " + arr[2] + " | " + arr[0]);
            default:
                break;
        }

        scan.close();
    }
}