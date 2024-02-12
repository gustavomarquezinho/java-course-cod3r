/*
 * Title: Challenge Date Class Test
 * Section: 05 
 * Lecture: 94
 */

package challenges;

public class ChallengeDateTest {
    public static void main(String[] args) {
        ChallengeDate date1 = new ChallengeDate();
        date1.day = 15;
        date1.month = 1;
        date1.year = 2311;

        ChallengeDate date2 = new ChallengeDate();
        date2.day = 1;
        date2.month = 8;
        date2.year = 2001;

        System.out.printf("Date 1 -> %02d/%02d/%d\n", date1.day, date1.month, date1.year);
        System.out.printf("Date 2 -> %02d/%02d/%d\n", date2.day, date2.month, date2.year);
    }
}
