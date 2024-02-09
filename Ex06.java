/* 
    Make an algorithm that reads the
    duration of an event in a factory
    expressed in seconds and displays 
    it expressed in hours, minutes 
    and seconds.
*/

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int duration, hours = 0, minutes = 0, seconds = 0;

        System.out.println("Enter how long the event lasted in seconds:");
        duration = scan.nextInt();

        while (duration > 0) {
            if (duration > 3600){
                duration -= 3600;
                hours += 1;
            } else if (duration > 60) {
                duration -= 60;
                minutes += 1;
            } else {
                seconds = duration;
                duration = 0;
            }
        }

        System.out.println("The event lasted " + hours + " hours,"
            + minutes + " minutes and " + seconds + " seconds.");

        scan.close();
    }   
}