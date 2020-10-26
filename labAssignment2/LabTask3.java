/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (191500255))
 *  Date: 22-07-2020
 *  Time: 05:55 PM
 */

//3. Create a program in Java to demonstrate declaration, initialization and usage of local variables.

package labAssignment2;

public class LabTask3 {
    public static void main(String[] args) {
        int localVar = 532; //Here localVar is a type of local variable which is of Integer Data type and is declared and initialized inside the main method.
        System.out.println("Local Variable Can Only Be accessed inside the method as----- " + localVar);

        //Here localVar is of integer data type and is declared and initialized inside the main method.
        //Hence It can only be accessed inside the main method other than that it cannot be accessed anywhere.
        //Therefore we can say that a local variable is a variable in JAVA that can only be accessed inside that method in which it is declared.
    }
    //System.out.println(localVar);

    //Like Here we are trying to access localVar outside the main method but by doing so our code shows us an error.
    //Because localVar was a local variable which was declared inside the main method.
    //Therefore it is clear that we cannot access a local variable outside the method in which it was declared.


    void anotherMethod() {
        //System.out.println(localVar);

        //Here we are trying to access localVar inside another method of the same class but then also our code is showing us an error.
        //Therefore it is clear that a local variable can neither be used inside any other method nor outside of the method in which it was declared.
        //It can only be used inside that particular method in which it was declared and initialized.
    }
}
