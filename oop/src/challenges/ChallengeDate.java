 /*
 * Title: Challenge Date
 * 
 * Description (Lecture 94): Create a simple class with just the declaration of 
 *                           the attributes necessary to compose a date.
 * 
 * Description (Lecture 98): Create a method that will return the formatted date
 *                           (DD/MM/YYYY format). For the string to be reused,
 *                           the method must return the string, not display it.
 * 
 * Section: 05 
 * Lecture: 94, 98
 * 
 * Considerations
 * - Difficulty: Easy
 * - Resolution time: ~1 minute
 */

package challenges;

public class ChallengeDate {
    byte day;
    byte month;
    int year;

    String getFormattedDate() {
        return String.format("%02d/%02d/%04d", this.day, this.month, this.year);
    }
}
