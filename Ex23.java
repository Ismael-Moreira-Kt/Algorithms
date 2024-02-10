/* 
    Create an algorithm that reads 3 values ​
    ​a,b,c and checks whether they form a 
    triangle or not. Assume that the values 
    ​​read are integers and positive. If the 
    values ​​form a triangle, calculate and 
    write the area of ​​this triangle. If 
    they do not form a triangle, write 
    the values ​​read. 
    (if a > b + c do not form any triangle, 
    if a is the largest).
*/

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the 3 sides of the triangle: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("Does not form a triangle.");
        } else {
            double s = (a+b+c)/2.0;
            double triangleArea = Math.sqrt(
                s * (s - a) * (s - b) * (s - c)
            );
            System.out.println("Area of ​​the triangle: " + triangleArea);
        }

        scan.close();
    }
}