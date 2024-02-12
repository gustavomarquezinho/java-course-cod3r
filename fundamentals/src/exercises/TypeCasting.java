/*
 * Title: Type Casting
 * Section: 03 
 * Lecture: 35 
 */

package exercises;

public class TypeCasting {
    public static void main(String[] args) {
        /*
         * Widening Casting (Conversão implícita)
         */

        // Integer to Short
        short a = 2;

        // Integer to Double
        double b = 1;

        /*
         * Narrowing Casting (Conversão explícita)
         */

        // Double to Float
        float c = (float) 1.0;

        // Integer to Byte
        byte d = (byte) 340;

        System.out.println(a * b * c * d);
    }
}
