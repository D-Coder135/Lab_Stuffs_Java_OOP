/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 05-08-2020
 *  Time: 01:22 PM
 *  File: Lab5Task.java
 */
package labAssignment5;

/**
 * Create a program in Java to create OTP (One-Time Passwords) for a customer service.
 */
public class Lab5Task {
    private static final int RANDOM_NUMBER_MAX_LIMIT = 10;

    /**
     * This method generates an OTP for the customer depending upon the number of digits.
     *
     * @return the generated OTP.
     */
    private static int generateOTP() {
        int numberOfDigitsInOTP = 6;
        int oneTimePassword = 0;
        for (int digitsInOTP = 0; digitsInOTP < numberOfDigitsInOTP; digitsInOTP++) {
            int randomNumber = 0;
            randomNumber = createRandomNumber();
            int powerOf10 = (int) Math.pow(10.0, digitsInOTP);
            powerOf10 = randomNumber * powerOf10;
            oneTimePassword = oneTimePassword + powerOf10;
        }
        return oneTimePassword;
    }

    /**
     * This method generates a random number between 0 and 9 for the OTP.
     *
     * @return a random number between 0 and 9.
     */
    private static int createRandomNumber() {
        return (int) (Math.random() * RANDOM_NUMBER_MAX_LIMIT);
    }

    /**
     * This method prints the generated OTP with some dashes between the characters.
     *
     * @param generatedOTP the random OTP generated from the generateOTP method.
     */
    private static void printOTP(int generatedOTP) {
        String otpString = String.valueOf(generatedOTP);
        for (int index = 0; index < otpString.length(); index++) {
            System.out.print(otpString.charAt(index) + (index < otpString.length() - 1 ? "-" : ""));
        }
    }

    public static void main(String[] args) {
        int generatedOTP = generateOTP();
        System.out.print("Your OTP is : ");
        printOTP(generatedOTP);
    }
}
