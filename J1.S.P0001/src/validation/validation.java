/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class validation {

    private static final Scanner sc = new Scanner(System.in);
    
    public static String checkInlutDecimal() {
        System.out.print("Enter numer decimal: ");
        String result = "";
        while (true) {
            result = sc.nextLine().trim();
            if (result.matches("[0-9]*")) {
                return result;
            }
            System.err.println("Must be enter decimal number");
            System.out.print("re-Enter: ");
        }
    }
    
    public static int inputInt() {
        while (true) {
            System.out.print("Enter a positive integer: ");
            String s = sc.nextLine().trim();
            try {
                int n = Integer.parseInt(s); 
                if (n > 0) {                 
                    return n;
                } else {
                    System.out.println("Please enter positive nnumber.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input a valid integer.");
            }
        }
    }
}
