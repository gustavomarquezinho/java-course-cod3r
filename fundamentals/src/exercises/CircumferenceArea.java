/*
 * Title: Circumference Area
 * Section: 03 
 * Lecture: 21 
 */

package exercises;

public class CircumferenceArea {
    public static void main(String[] args) {
        final double PI = 3.14159;

        double radius = 3.4;
        double area = PI * (radius * radius);

        System.out.printf("Radius: %.4f | Area: %.4fm²", radius, area);
    }
}
