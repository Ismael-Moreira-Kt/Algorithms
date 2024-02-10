/* 
    A company will grant a salary increase 
    to its employees, which varies according 
    to the position, as shown in the table below. 
    Make an algorithm that reads an employee's 
    salary and title and calculates the new salary. 
    If the employee's position is not on the table, 
    he or she must then receive a 40% increase. 
    Show the old salary, the new salary and the difference.
        Percentage Position Code
        101 Manager 10%
        102 Engineer 20%
        103 Technician 30%
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public record Ex22() {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double increase;
        Map<Integer, Double> office = new HashMap<>(){{
            put(101, .1);
            put(102, .2);
            put(103, .3);
        }};

        System.out.println("Enter your salary: ");
        double salary = scan.nextDouble();
        System.out.println("Enter your code: ");
        int code = scan.nextInt();

        if (office.containsKey(code)){
            increase = office.get(code); 
        } else {
            increase = .4;
        }

        double newSalary = salary + (salary * increase);
        double difference = newSalary - salary;

        System.out.println("Old salary: " + salary);
        System.out.println("New salary: " + newSalary);
        System.out.println("Increase: " + difference);
        
        scan.close();
    }
}