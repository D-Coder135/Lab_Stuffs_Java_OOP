/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (191500255))
 *  Date: 22-07-2020
 *  Time: 06:49 PM
 */

//4. Create a program in Java to demonstrate declaration, initialization and usage of static and non-static variables.

package labAssignment2;

public class LabTask4 {

    int objectOwned = 55; //Here objectOwned is a non static variable of Integer Data Type.

    /* A non static variable is a type of variable in Java which is Object Owned which means
     * it can only be accessed in a method which is also a non static method.
     *
     * If we want to access a non static variable inside a static method then we will have to call it along with
     * the name of the object of that class.
     *
     * A non static variable is created separately for every separate object.
     *
     */
    static int classOwned = 666; //Here classOwned is a static variable of Integer Data Type.

    /* A static variable is a type of variable in Java which is Class Owned which means
     * it can be accessed anywhere inside that particular class only.
     *
     * Like If we want to access a static variable inside a non static method there also we can easily access it
     * as the variable is static so it can be accessed in any method of that class weather static method or
     * non static method.
     *
     * A static method is only created once inside a particular class.
     *
     */


    public static void main(String[] args) {
        System.out.println(classOwned); // Here the main method is a static method therefore we can easily use a static variable inside it.

        // System.out.println(objectOwned); //Here We are trying to use a non static variable inside a static method therefore our code shows an error.

        LabTask4 labTask4Object = new LabTask4(); // Creating an object of the class LabTask4 inside the main method which is semantically wrong.

        System.out.println(labTask4Object.objectOwned); //Here we are using a non static variable inside a static method along with the object name therefore it can be used.

    }

    void anotherMethod() { // This is a non static method i.e., an object owned method.
        System.out.println(objectOwned); // Here we are accessing a non static variable inside a non static method therefore it can be easily accessed.

        System.out.println(classOwned); //Here we are accessing a static variable inside a non static method and it is easily accessible here as the variable is static.
    }
}
