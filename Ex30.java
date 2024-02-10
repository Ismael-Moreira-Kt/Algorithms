/* 
    The department that controls the environmental 
    pollution index maintains 3 groups of industries 
    that are highly polluting the environment. 
    The acceptable pollution index varies from 0.05 
    to 0.25. If the index rises to 0.3, industries in 
    the 1st group are ordered to suspend their activities, 
    if the index rises to 0.4, those in the 1st and 2nd 
    groups are ordered to suspend their activities and 
    if the index reaches 0.5, all 3 groups must be notified 
    to stop their activities. Write an algorithm that reads 
    the measured pollution index and issues appropriate 
    notification to different groups of companies.
*/

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the current pollution index?");
        double pollution = scan.nextDouble();

        boolean[] groups = new boolean[3]; 

        if (pollution > .3 && pollution < .4){
            groups[0] = false;
            groups[1] = false;
            groups[2] = true;
        } else if (pollution >= .4 && pollution < .5) {
            groups[0] = true;
            groups[1] = true;
            groups[2] = false;
        } else if (pollution >= .5) {
            groups[0] = true;
            groups[1] = true;
            groups[2] = true;
        } else {
            groups[0] = false;
            groups[1] = false;
            groups[2] = false;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Pollution Index: " + pollution);
            if (groups[i]) {
                System.out.println("Enterprise " + (i + 1) +  " Suspend your activities!");
            } else {
                System.out.println("Enterprise " + (i + 1) +  ": 200");
            }
        }
        

        scan.close();
    }    
}