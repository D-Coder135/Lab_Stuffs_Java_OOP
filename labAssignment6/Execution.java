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
        String currentMonthName = new GregorianCalendar().getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
    }
}
