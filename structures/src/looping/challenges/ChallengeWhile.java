/*
 * Title: Challenge While
 * 
 * Description: Using a while loop, receive the grades of N students and store
 *              them in a variable. Stop the loop and display the average of
 *              the grades if the entered grade is equal to -1. Ensure that only
 *              values in the range of 0.0 to 10.0, inclusive, are stored in 
 *              auxiliary variables.
 * 
 * Section: 04 
 * Lecture: 74 
 * 
 * Considerations
 * - Difficulty: Easy
 * - Resolution time: ~5 minutes
 */

package looping.challenges;

import java.util.Scanner;

public class ChallengeWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double studentGrade = 0.0;
        double sumGrades = 0.0;
        int totalGrades = 0;

        while (studentGrade != -1) {
            System.out.print("> Insert the student grade (Enter -1 to finish): ");
            studentGrade = input.nextDouble();

            if (studentGrade < 0.0 || studentGrade > 10.0) {
                if(studentGrade != -1) {
                    System.out.println("x Invalid student grade value (enter values between 0.0 and 10.0)!");
                }
            } else {
                sumGrades += studentGrade;
                totalGrades++;
            }
        }

        System.out.printf("Average grade of %d students: %.2f",
                totalGrades, sumGrades / totalGrades);

        input.close();
    }
}
