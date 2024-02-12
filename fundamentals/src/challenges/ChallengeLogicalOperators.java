/*
 * Title: Challenge Logical Operators
 * 
 * Description: Using only logical operators, create the following logic.
 *              1. Buy a 50-inch television if you worked on Tuesday and Thursday.
 *              2. Buy a 32-inch television if you worked on Tuesday or Thursday.
 *              3. Go to the mall for ice cream if you bought one of the televisions.
 *              4. If you didn't buy any of the televisions, stay at home and be health-
 *                 ier for not eating ice cream at the mall.
 * 
 * Section: 03 
 * Lecture: 48 
 * 
 * Considerations
 * - Difficulty: Easy
 * - Resolution time: ~5 minutes
 */

package challenges;

public class ChallengeLogicalOperators {
    public static void main(String[] args) {
        boolean workedOnTuesday = true;
        boolean workedOnThursday = false;

        boolean boughtThe50InchTV = workedOnTuesday && workedOnThursday;
        boolean boughtThe32InchTV = workedOnTuesday ^ workedOnThursday;

        boolean ateIceCreamAtTheMall = boughtThe50InchTV || boughtThe32InchTV;
        boolean becameHealthier = !ateIceCreamAtTheMall;

        System.out.printf("Worked On Tuesday: %s\n",
                Boolean.toString(workedOnTuesday));

        System.out.printf("Worked On Thursday: %s\n",
                Boolean.toString(workedOnThursday));

        System.out.printf("Bought The 50 Inch TV: %s\n",
                Boolean.toString(boughtThe50InchTV));

        System.out.printf("Bought The 32 Inch TV: %s\n",
                Boolean.toString(boughtThe32InchTV));

        System.out.printf("Ate ice cream at the mall: %s\n",
                Boolean.toString(ateIceCreamAtTheMall));

        System.out.printf("Became Healthier: %s\n",
                Boolean.toString(becameHealthier));
    }
}
