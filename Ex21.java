/* 
    A seller needs an algorithm that 
    calculates the total price owed 
    by a customer. The algorithm 
    must receive a product code and 
    the quantity purchased and 
    calculate the total price, using 
    the table below. Show a message 
    in case of invalid code.
        Code Unit price
        'ABCD' R$ 5.30
        'XYPK' R$ 6.00
        'KLMP' R$ 3.20
        'QRST' R$ 2.50
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Map<String, Double> menu = new HashMap<>(){{
            put("ABCD", 5.3);
            put("XYPK", 6.0);
            put("KLMP", 3.2);
            put("QRST", 2.5);
        }};

        System.out.println("Enter the item code: ");
        String item = scan.nextLine();
        item = item.toUpperCase();

        if (menu.containsKey(item)){
            System.out.println("Enter the quantity you want: ");
            int amount = scan.nextInt();

            double price = amount * menu.get(item);
            System.out.println("It will cost " + price);
        } else {
            System.out.println("Invalid code.");
        }

        scan.close();
    }
}