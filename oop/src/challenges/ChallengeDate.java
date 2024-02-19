 /*
 * Title: Challenge Date
 * 
 * Description (Lecture 094): Create a simple class with just the declaration of 
 *                           the attributes necessary to compose a date.
 * 
 * Description (Lecture 098): Create a method that will return the formatted date
 *                            (DD/MM/YYYY format). For the string to be reused,
 *                            the method must return the string, not display it.
 * 
 * Description (Lecture 102): Create 2 constructors for the class. The first one
 *                            will not receive any parameters and the default date
 *                            will be set 01/01/1970. The second will receive year,
 *                            month and day as parameters.
 * 
 * Section: 05 
 * Lecture: 94, 98, 102
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

    ChallengeDate() {
        this.year = 1970;
        this.month = 1;
        this.day = 1;
    }

    ChallengeDate(int dateYear, byte dateMonth, byte dateDay) {
        this.year = dateYear;
        this.month = dateMonth;
        this.day = dateDay;
    }

    String getFormattedDate() {
        return String.format("%02d/%02d/%04d", this.day, this.month, this.year);
    }
}
