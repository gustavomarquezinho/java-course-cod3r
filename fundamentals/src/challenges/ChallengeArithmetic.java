/*
 * Title: Challenge Arithmetic
 * 
 * Description: Solve the mathematical equation in './Challenge Arithmetic.png',
 *              making sure to split the operation into multiple variables to
 *              maintain code readability.
 * 
 * Section: 03 
 * Lecture: 44 
 * 
 * Considerations
 * - Difficulty: Easy
 * - Resolution time: ~10 minutes
 */

package challenges;

public class ChallengeArithmetic {
    public static void main(String[] args) {
        double innerNumerator1 = Math.pow(6 * (3 + 2), 2);
        double innerDenominator1 = 3 * 2;
        double innerResult1 = innerNumerator1 / innerDenominator1;

        double innerNumerator2 = (1 - 5) * (2 - 7);
        double innerDenominator2 = 2;

        double innerResult2 = innerNumerator2 / innerDenominator2;
        innerResult2 = Math.pow(innerResult2, 2);

        double innerResult = Math.pow(innerResult1 - innerResult2, 3);
        double result = innerResult / Math.pow(10, 3);

        System.out.println(result);
    }
}
