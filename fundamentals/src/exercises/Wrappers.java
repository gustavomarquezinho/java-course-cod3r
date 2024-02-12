/*
 * Title: Wrappers
 * Section: 03 
 * Lecture: 33
 */

package exercises;

public class Wrappers {
    public static void main(String[] args) {
        Byte byteObject = 127;
        System.out.println(byteObject.getClass());

        Short shortObject = 32767;
        System.out.println(shortObject.getClass());

        Integer intObject = 2147483647;
        System.out.println(intObject.getClass());

        Long longObject = 9223372036854775807L;
        System.out.println(longObject.getClass());

        Float floatObject = 1234.34F;
        System.out.println(floatObject.getClass());

        Double doubleObject = 12315.456;
        System.out.println(doubleObject.getClass());

        Boolean boolObject = Boolean.parseBoolean("true");
        System.out.println(boolObject.getClass());

        Character charObject = '#';
        System.out.println(charObject.getClass());
    }
}
