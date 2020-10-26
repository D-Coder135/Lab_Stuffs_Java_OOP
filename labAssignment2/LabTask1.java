/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (191500255))
 *  Date: 22-07-2020
 *  Time: 01:14 PM
 */

//1. Create a program in Java that prints the following table.


package labAssignment2;

public class LabTask1 {
    public static void main(String[] args) {
        System.out.printf("%13s\t%13s\t%13s\t%13s\t",
                "Data type",
                "Size In Bits",
                "Size in Bytes",
                "Range");
        System.out.println();
        System.out.printf("%13s\t%13s\t%13s\t%13s\t",
                "Byte",
                Byte.SIZE,
                Byte.SIZE / 8,
                "from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println();
        System.out.printf("%13s\t%13s\t%13s\t%13s\t",
                "Short",
                Short.SIZE,
                Short.SIZE / 8,
                "from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println();
        System.out.printf("%13s\t%13s\t%13s\t%13s\t",
                "Int",
                Integer.SIZE,
                Integer.SIZE / 8,
                "from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println();
        System.out.printf("%13s\t%13s\t%13s\t%13s\t",
                "Long",
                Long.SIZE,
                Long.SIZE / 8,
                "from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println();
        System.out.printf("%13s\t%13s\t%13s\t%13s\t",
                "Float",
                Float.SIZE,
                Float.SIZE / 8,
                "from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println();
        System.out.printf("%13s\t%13s\t%13s\t%13s\t",
                "Double",
                Double.SIZE,
                Double.SIZE / 8,
                "from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println();
        System.out.printf("%13s\t%13s\t%13s\t%13s\t",
                "Char",
                Character.SIZE,
                Character.SIZE / 8,
                "from " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE + " Or From " + Character.MIN_VALUE + " to " + Character.MAX_VALUE);
        System.out.println();
        System.out.printf("%13s\t%13s\t%13s\t%13s\t",
                "Boolean",
                "*",
                "*",
                "from " + Boolean.TRUE + " to " + Boolean.FALSE);

    }
}
