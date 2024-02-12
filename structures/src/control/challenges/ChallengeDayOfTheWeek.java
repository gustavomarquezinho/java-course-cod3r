/*
 * Title: Challenge Day Of The Week
 * 
 * Description: Ask the user for the name of the day of the week and return the
 *              number of the day of the week (1 for Sunday, 2 for Monday, 3 for
 *              Tuesday, etc.). Make sure to ignore case sensitive. 
 * 
 * Section: 04 
 * Lecture: 68 
 * 
 * Considerations
 * - Difficulty: Easy
 * - Resolution time: ~3 minutes
 */

package control.challenges;

import java.util.Scanner;

public class ChallengeDayOfTheWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter he name of the day of the week: ");
        String dayName = input.next();

        if (dayName.equalsIgnoreCase("Sunday")) {
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println(2);
        } else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println(3);
        } else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println(4);
        } else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println(5);
        } else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println(6);
        } else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println(7);
        } else {
            System.out.println("Invalid day of the week name!");
        }

        input.close();
    }
}
