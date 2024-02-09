/* 
    Write an algorithm that reads 
    the coefficients a,b,c,d,e and
    f and calculates and displays
    the values ​​of x and y.
*/

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a,b,c,d,e,f,x,y;

        System.out.println("Enter 6 numbers separated by enter: ");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        d = scan.nextDouble();
        e = scan.nextDouble();
        f = scan.nextDouble();


        x = ((c*e)-(b*f)) 
                / 
            ((a*e)-(b*d));
        
        y = ((a*f) - (c*d))
                /
            ((a*e)-(b*d));
        

        System.out.println("X: " + x);
        System.out.println("Y: " + y);

        scan.close();
    }
}