/*
 * Title: Primitive Data Types
 * Section: 03 
 * Lecture: 26 
 */

package exercises;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte yearsInCompany = 23;
        short fliesCount = 542;
        int userID = 56789;

        long totalSells = 3_134_845_223L;
        double totalPoints = 4_561_465_234.23;
        float currentSalary = 11_445.44F;

        boolean isOnVacation = false;
        char gender = 'M';

        System.out.printf("User ID: %d\n", userID);
        System.out.printf("Current salary: $%.2f\n", currentSalary);
        System.out.printf("Is On Vacation: %s\n", isOnVacation ? "Yes" : "No");
        System.out.printf("Gender: %c\n", gender);

        System.out.printf("Average travels per year: %.2f\n", (double) (fliesCount / 2) / yearsInCompany);
        System.out.printf("Average points per sell: %.2f\n", totalPoints / totalSells);
    }
}
