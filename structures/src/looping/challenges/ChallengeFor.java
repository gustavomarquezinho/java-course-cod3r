/*
 * Title: Challenge For
 * 
 * Description: Display a staircase with the '#' character that goes up to the
 *              fifth step. Only use the for loop and do not use any numeric
 *              values.
 * 
 * Section: 04 
 * Lecture: 78 
 * 
 * Considerations
 * - Difficulty: Easy
 * - Resolution time: ~1 minute
 */

package looping.challenges;

public class ChallengeFor {
    public static void main(String[] args) {
        for (String i = "#"; !i.equals("######"); i += "#") {
            System.out.println(i);
        }
    }
}
