/*
 * Title: Challenge Date Class Test
 * Section: 05 
 * Lecture: 94, 98, 102
 */

package challenges;

public class ChallengeDateTest {
    public static void main(String[] args) {
        ChallengeDate date1 = new ChallengeDate(2311, (byte) 1, (byte) 15);
        ChallengeDate date2 = new ChallengeDate(2001, (byte) 8, (byte) 1);
        ChallengeDate date3 = new ChallengeDate();

        System.out.printf("Date 1 -> %s\n", date1.getFormattedDate());
        System.out.printf("Date 2 -> %s\n", date2.getFormattedDate());
        System.out.printf("Date 3 -> %s\n", date3.getFormattedDate());
    }
}
