/*
 * Title: Challenge Calculator
 * 
 * Description: Receive two numbers from the user and the operation, 
 *              then calculate the result with ternary operator only.
 * 
 * Section: 03 
 * Lecture: 57 
 * 
 * Considerations
 * - Difficulty: Easy
 * - Resolution time: ~7 minutes
 */

package challenges;

import java.util.Scanner;

public class ChallengeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The First Number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter The Second Number: ");
        double number2 = input.nextDouble();

        System.out.print("Enter The Operation (+, -, /, *, %): ");
        String operation = input.next();

        double result = operation.equals("+") ? (number1 - number2) : (0.0);
        result = operation.equals("-") ? (number1 - number2) : (result);
        result = operation.equals("*") ? (number1 * number2) : (result);
        result = operation.equals("/") ? (number1 / number2) : (result);
        result = operation.equals("%") ? (number1 % number2) : (result);

        System.out.printf("%.1f %s %.1f = %.1f", number1, operation, number2, result);

        input.close();
    }
}
