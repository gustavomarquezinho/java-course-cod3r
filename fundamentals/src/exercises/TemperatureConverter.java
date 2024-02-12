/*
 * Title: Temperature Converter
 * Section: 03 
 * Lecture: 22 
 */

package exercises;

public class TemperatureConverter {
    public static void main(String[] args) {
        final int fahrenheitFreezingPoint = 32;
        final double conversionFactor = 5.0 / 9.0;

        double fahrenheit = 86.0;
        double celsius = (fahrenheit - fahrenheitFreezingPoint) * conversionFactor;

        System.out.printf("%.2fFº = %.2fCº", fahrenheit, celsius);
    }
}
