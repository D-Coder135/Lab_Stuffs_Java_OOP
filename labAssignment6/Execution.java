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
            case JANUARY -> System.out.println(Months.JANUARY.getTotalNumberOfDays() + " - " + currentDate + " = " + (Months.JANUARY.getTotalNumberOfDays() - currentDate) + " Days left in " + Months.JANUARY.name().toLowerCase() + "!");
            case FEBRUARY -> System.out.println(Months.FEBRUARY.getTotalNumberOfDays() + " - " + currentDate + " = " + (Months.FEBRUARY.getTotalNumberOfDays() - currentDate) + " Days left in " + Months.FEBRUARY.name().toLowerCase() + "!");
            case MARCH -> System.out.println(Months.MARCH.getTotalNumberOfDays() + " - " + currentDate + " = " + (Months.MARCH.getTotalNumberOfDays() - currentDate) + " Days left in " + Months.MARCH.name().toLowerCase() + "!");
            case APRIL -> System.out.println(Months.APRIL.getTotalNumberOfDays() + " - " + currentDate + " = " + (Months.APRIL.getTotalNumberOfDays() - currentDate) + " Days left in " + Months.APRIL.name().toLowerCase() + "!");
            case MAY -> System.out.println(Months.MAY.getTotalNumberOfDays() + " - " + currentDate + " = " + (Months.MAY.getTotalNumberOfDays() - currentDate) + " Days left in " + Months.MAY.name().toLowerCase() + "!");
            case JUNE -> System.out.println(Months.JUNE.getTotalNumberOfDays() + " - " + currentDate + " = " + (Months.JUNE.getTotalNumberOfDays() - currentDate) + " Days left in " + Months.JUNE.name().toLowerCase() + "!");
            case JULY -> System.out.println(Months.JULY.getTotalNumberOfDays() + " - " + currentDate + " = " + (Months.JULY.getTotalNumberOfDays() - currentDate) + " Days left in " + Months.JULY.name().toLowerCase() + "!");
            case AUGUST -> System.out.println(Months.AUGUST.getTotalNumberOfDays() + " - " + currentDate + " = " + (Months.AUGUST.getTotalNumberOfDays() - currentDate) + " Days left in " + Months.AUGUST.name().toLowerCase() + "!");
            case SEPTEMBER -> System.out.println(Months.SEPTEMBER.getTotalNumberOfDays() + " - " + currentDate + " = " + (Months.SEPTEMBER.getTotalNumberOfDays() - currentDate) + " Days left in " + Months.SEPTEMBER.name().toLowerCase() + "!");
            case OCTOBER -> System.out.println(Months.OCTOBER.getTotalNumberOfDays() + " - " + currentDate + " = " + (Months.OCTOBER.getTotalNumberOfDays() - currentDate) + " Days left in " + Months.OCTOBER.name().toLowerCase() + "!");
            case NOVEMBER -> System.out.println(Months.NOVEMBER.getTotalNumberOfDays() + " - " + currentDate + " = " + (Months.NOVEMBER.getTotalNumberOfDays() - currentDate) + " Days left in " + Months.NOVEMBER.name().toLowerCase() + "!");
            case DECEMBER -> System.out.println(Months.DECEMBER.getTotalNumberOfDays() + " - " + currentDate + " = " + (Months.DECEMBER.getTotalNumberOfDays() - currentDate) + " Days left in " + Months.DECEMBER.name().toLowerCase() + "!");
        }

    }
}
