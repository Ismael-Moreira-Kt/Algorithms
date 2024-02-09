/*
    Build an algorithm that, taking as input data
    any two points on the plane, P(x1,y1) and 
    P(x2,y2), writes the distance between them.
*/

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x1, x2, y1, y2;

        System.out.println("Enter the first coordinate: ");
        
        System.out.println("X1: ");
        x1 = scan.nextInt();

        System.out.println("y1: ");
        y1 = scan.nextInt();

        System.out.println("Enter the second coordinate: ");
        
        System.out.println("X2: ");
        x2 = scan.nextInt();

        System.out.println("y2: ");
        y2 = scan.nextInt();

        double distance = Math.sqrt(
            (Math.pow((x2-x1), 2))
            +
            (Math.pow((y2-y1), 2))
        );

        System.out.println("The distance between the two points is: " + distance);

        scan.close();
    }
}