/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 01-08-2020
 *  Time: 12:12 PM
 *  File:Lab4Task.java
 */
package labAssignment4;

import java.util.Scanner;

public class Lab4Task {
    private static final byte TOTAL_PARTICIPANTS = 100;

    private static void sellTicket(String participantName) {
        String message = "Congratulations, " + participantName + ". " + "See you at the conference!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        byte numberOfTicketsSold = 0;
        while (numberOfTicketsSold <= TOTAL_PARTICIPANTS) {
            System.out.println("Total Tickets left: " + (TOTAL_PARTICIPANTS - numberOfTicketsSold));
            System.out.println("Please enter your name: ");
            Scanner scannerObject = new Scanner(System.in);
            String nameOfParticipant = scannerObject.nextLine();
            Lab4Task.sellTicket(nameOfParticipant);
            numberOfTicketsSold += 1;
            boolean equalityBetweenTicketsAndParticipants = (numberOfTicketsSold == TOTAL_PARTICIPANTS);
            if (equalityBetweenTicketsAndParticipants) {
                System.out.println("Sorry, The tickets are sold-out!");
                scannerObject.close();
                break;
            }

        }
    }

}
