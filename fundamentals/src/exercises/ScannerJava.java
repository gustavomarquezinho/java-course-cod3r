/*
 * Title: Scanner Java
 * Section: 03 
 * Lecture: 30 
 */

package exercises;

import java.util.Scanner;

public class ScannerJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First name: ");
        String userFirstName = input.nextLine();

        System.out.print("Last name: ");
        String userLastName = input.nextLine();

        System.out.print("Age: ");
        byte userAge = input.nextByte();

        System.out.print("Current year: ");
        int currentYear = input.nextInt();

        System.out.printf("\nYour name is %s and you are %d years old.\n",
                userFirstName + " " + userLastName, userAge);

        System.out.printf("You were born in %d.",
                currentYear - userAge);

        input.close();
    }
}
