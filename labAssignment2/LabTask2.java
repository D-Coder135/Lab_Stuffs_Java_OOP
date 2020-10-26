/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (191500255))
 *  Date: 22-07-2020
 *  Time: 05:29 PM
 */

//2. Create a program in Java to create local variables with the var keyword. Assign the value of all 8 primitive data types to 8 variables.

package labAssignment2;

public class LabTask2 {
    public static void main(String[] args) {
        var byteVariable = 13;
        var shortVariable = 136;
        var integerVariable = 165423;
        var longVariable = 12235456;
        var floatVariable = 2.24f;
        var doubleVariable = 2.154892d;
        var characterVariable = 'D';
        var booleanVariable = false;
        System.out.println("Byte Value = " + byteVariable);
        System.out.println("Short Value = " + shortVariable);
        System.out.println("Integer Value = " + integerVariable);
        System.out.println("Long Value = " + longVariable);
        System.out.println("Float Value = " + floatVariable);
        System.out.println("Double Value = " + doubleVariable);
        System.out.println("Character Value = " + characterVariable);
        System.out.println("Boolean Value = " + booleanVariable);
    }
}
