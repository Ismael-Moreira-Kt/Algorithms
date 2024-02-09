/*
    Write an algorithm that reads three positive integers
    (A, B, C) and calculates the following expression:
    D = (R+S)/2 where R = (a+b) ** 2 and S = (b+c) ** 2
*/

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a, b, c;
        double r, s;

        System.out.println("Type three whole numbers (separated by enter)");

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        r = Math.pow((a + b),2);
        s = Math.pow((b + c),2);

        double d =  (double)((r+s)/2);

        System.out.println("R: " + r);
        System.out.println("S: " + s);
        System.out.println("D: " + d);

        scan.close();
    }   
}