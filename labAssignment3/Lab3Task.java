/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 29-07-2020
 *  Time: 01:54 PM
 *  File: Lab3Task.java
 */
package labAssignment3;

import java.util.Scanner;

public class Lab3Task {
    public static final String DISCOUNT_CODE = "CoVid19";

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.print("Enter Your Discount Coupon Code: ");
        String clientInputDiscountCode = scannerObject.nextLine();
        scannerObject.close();
        if (clientInputDiscountCode.isEmpty() || clientInputDiscountCode.isBlank()) {
            System.out.println("The coupon code cannot be blank or empty.");
        } else if (clientInputDiscountCode.equalsIgnoreCase(DISCOUNT_CODE)) {
            System.out.println("Congrats, you get ₹ 100 off on your bill!");
        } else {
            System.out.println("Entered coupon code is not valid");
        }
    }
}
