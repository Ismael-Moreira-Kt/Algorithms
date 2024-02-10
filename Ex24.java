/* 
    Write an algorithm that reads the start time 
    of a game and the end time of the game 
    (considering only whole hours) and calculates 
    the duration of the game in hours, knowing 
    that the maximum duration of the game is 
    24 hours and that the game can start one day 
    and end the next day.
*/

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time;

        System.out.println("Type the start and end time of the game separated by enter");
        int start = scan.nextInt();
        int end = scan.nextInt();

        if (start > end) {
            start = Math.abs(start - 24);
            time = start + end;
        } else {
            time = end - start;
        }

        System.out.println("Game time: " + time);

        scan.close();
    }
}