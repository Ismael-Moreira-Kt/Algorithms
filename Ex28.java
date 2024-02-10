/* 
    Write an algorithm that reads the start time 
    and end time of a game, both subdivided into 
    two distinct values: hours and minutes. 
    Calculate and write the duration of the game, 
    also in hours and minutes, considering that 
    the maximum duration of a game is 24 hours 
    and that the game can start on one day and 
    end on the next day.
*/

import java.util.Scanner;

public class Ex28 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type the start time (hour and minute separated by enter):");
        int startHour = scan.nextInt();
        int startMinute = scan.nextInt();

        System.out.println("Type the end time (hour and minute separated by enter):");
        int endHour = scan.nextInt();
        int endMinute = scan.nextInt();

        int totalStartMinutes = startHour * 60 + startMinute;
        int totalEndMinutes = endHour * 60 + endMinute;

        int totalTimeMinutes;

        if (totalStartMinutes > totalEndMinutes) {
            totalEndMinutes += 24 * 60;
        }

        totalTimeMinutes = totalEndMinutes - totalStartMinutes;

        int totalTimeHours = totalTimeMinutes / 60;
        int remainingMinutes = totalTimeMinutes % 60;

        System.out.println("Game duration: " + totalTimeHours + " hours and " + remainingMinutes + " minutes");

        scan.close();
    }
}