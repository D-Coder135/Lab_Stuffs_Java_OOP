/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 27-10-2020
 *  Time: 12:59 PM
 */
package labAssignment6;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Execution {
    public static void main(String[] args) {
        String currentMonthName = new GregorianCalendar().getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH).toUpperCase();
        int currentDate = new GregorianCalendar().get(Calendar.DATE);
        Months currentMonth = Months.valueOf(currentMonthName);
        switch (currentMonth) {
            case JANUARY -> System.out.println(Months.JANUARY.getNumberOfDays() + " - " + currentDate + " = " + (Months.JANUARY.getNumberOfDays() - currentDate) + " Days left in " + Months.JANUARY.name().toLowerCase() + "!");
            case FEBRUARY -> System.out.println(Months.FEBRUARY.getNumberOfDays() + " - " + currentDate + " = " + (Months.FEBRUARY.getNumberOfDays() - currentDate) + " Days left in " + Months.FEBRUARY.name().toLowerCase() + "!");
            case MARCH -> System.out.println(Months.MARCH.getNumberOfDays() + " - " + currentDate + " = " + (Months.MARCH.getNumberOfDays() - currentDate) + " Days left in " + Months.MARCH.name().toLowerCase() + "!");
            case APRIL -> System.out.println(Months.APRIL.getNumberOfDays() + " - " + currentDate + " = " + (Months.APRIL.getNumberOfDays() - currentDate) + " Days left in " + Months.APRIL.name().toLowerCase() + "!");
            case MAY -> System.out.println(Months.MAY.getNumberOfDays() + " - " + currentDate + " = " + (Months.MAY.getNumberOfDays() - currentDate) + " Days left in " + Months.MAY.name().toLowerCase() + "!");
            case JUNE -> System.out.println(Months.JUNE.getNumberOfDays() + " - " + currentDate + " = " + (Months.JUNE.getNumberOfDays() - currentDate) + " Days left in " + Months.JUNE.name().toLowerCase() + "!");
            case JULY -> System.out.println(Months.JULY.getNumberOfDays() + " - " + currentDate + " = " + (Months.JULY.getNumberOfDays() - currentDate) + " Days left in " + Months.JULY.name().toLowerCase() + "!");
            case AUGUST -> System.out.println(Months.AUGUST.getNumberOfDays() + " - " + currentDate + " = " + (Months.AUGUST.getNumberOfDays() - currentDate) + " Days left in " + Months.AUGUST.name().toLowerCase() + "!");
            case SEPTEMBER -> System.out.println(Months.SEPTEMBER.getNumberOfDays() + " - " + currentDate + " = " + (Months.SEPTEMBER.getNumberOfDays() - currentDate) + " Days left in " + Months.SEPTEMBER.name().toLowerCase() + "!");
            case OCTOBER -> System.out.println(Months.OCTOBER.getNumberOfDays() + " - " + currentDate + " = " + (Months.OCTOBER.getNumberOfDays() - currentDate) + " Days left in " + Months.OCTOBER.name().toLowerCase() + "!");
            case NOVEMBER -> System.out.println(Months.NOVEMBER.getNumberOfDays() + " - " + currentDate + " = " + (Months.NOVEMBER.getNumberOfDays() - currentDate) + " Days left in " + Months.NOVEMBER.name().toLowerCase() + "!");
            case DECEMBER -> System.out.println(Months.DECEMBER.getNumberOfDays() + " - " + currentDate + " = " + (Months.DECEMBER.getNumberOfDays() - currentDate) + " Days left in " + Months.DECEMBER.name().toLowerCase() + "!");
            default -> System.out.println("Invalid Month Name!");
        }

    }
}
