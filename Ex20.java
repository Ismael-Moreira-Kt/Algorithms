/* 
    A seller needs an algorithm that calculates 
    the total price owed by a customer. The 
    algorithm must receive a product code and 
    the quantity purchased and calculate the 
    total price, using the table below:
        Product  | Unit price
        1001 | 5.32
        1324 | 6.45
        6548 | 2.37
        0987 | 5.32
        7623 | 6.45
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Map<String, Double> menu = new HashMap<>(){{
            put("1001", 5.32);
            put("1324", 6.45);
            put("6548", 2.37);
            put("0987", 5.32);
            put("7623", 6.45);
        }};


        System.out.println("Enter the item code: ");
        String code = scan.nextLine();

        System.out.println("How many of this item do you want?");
        int amount = scan.nextInt();

        double price = menu.get(code);

        Double totalCost = amount * price;

        System.out.println("It will cost " + totalCost);

        scan.close();
    }
}