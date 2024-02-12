/*
 * Title: Challenge Data Class Test
 * Section: 05 
 * Lecture: 94
 */

package challenges;

public class ChallengeDataTest {
    public static void main(String[] args) {
        ChallengeData data1 = new ChallengeData();
        data1.day = 15;
        data1.month = 1;
        data1.year = 2311;

        ChallengeData data2 = new ChallengeData();
        data2.day = 1;
        data2.month = 8;
        data2.year = 2001;

        System.out.printf("Data 1 -> %02d/%02d/%d\n", data1.day, data1.month, data1.year);
        System.out.printf("Data 2 -> %02d/%02d/%d\n", data2.day, data2.month, data2.year);
    }
}
