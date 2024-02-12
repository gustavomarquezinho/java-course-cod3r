/*
 * Title: Challenge Conversion
 * 
 * Description: Receive the user's last three salaries and calculate the average
 *              at the end. Make sure to change the decimal separator from '.' to
 *              ',' to follow the European and Brazilian standard.
 * 
 * Section: 03 
 * Lecture: 38 
 * 
 * Considerations
 * - Difficulty: Easy
 * - Resolution time: ~5 minutes
 */

package challenges;

import java.util.Scanner;

public class ChallengeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Last Salary 1: $ ");
        String stringSalary1 = input.nextLine().replace(",", ".");

        System.out.print("Last Salary 2: $ ");
        String stringSalary2 = input.nextLine().replace(",", ".");

        System.out.print("Last Salary 3: $ ");
        String stringSalary3 = input.nextLine().replace(",", ".");

        final double salary1 = Double.parseDouble(stringSalary1);
        final double salary2 = Double.parseDouble(stringSalary2);
        final double salary3 = Double.parseDouble(stringSalary3);

        final double salaryAverage = (salary1 + salary2 + salary3) / 3;

        System.out.printf(
                "Average salary for the last three months: $%.2f",
                salaryAverage);

        input.close();
    }
}
