/* 
    The snack bar menu is as follows:
        Specification Code Price
        Hot dog 100 1.20
        Simple Bauru 101 1.30
        Bauru with egg 102 1.50
        Burger 103 1.20
        Cheeseburger 104 1.30
        Soda 105 1.00

    Write an algorithm that reads the 
    code of the ordered item, the 
    quantity and calculates the amount 
    to be paid for that snack. Consider 
    that at each execution only one 
    item will be calculated.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Map<Integer, Double> menu = new HashMap<>(){{
            put(100, 1.2);
            put(101, 1.3);
            put(102, 1.5);
            put(103, 1.2);
            put(104, 1.3);
            put(105, 1.0);
        }};


        System.out.println("Enter the item code: ");
        int code = scan.nextInt();

        System.out.println("How many of this item do you want?");
        int amount = scan.nextInt();

        double price = menu.get(code);

        Double totalCost = amount * price;

        System.out.println("It will cost " + totalCost);

    }
}