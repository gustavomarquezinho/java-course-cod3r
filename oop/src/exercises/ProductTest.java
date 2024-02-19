/*
 * Title: Product Class Test
 * Section: 05 
 * Lecture: 93, 97, 101
 */

package exercises;

public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product("Notebook", 4567.98, 0.05);

        System.out.printf("--- %s ---\n", product1.name);
        System.out.printf("Price: $%.2f\n", product1.price);
        System.out.printf("Discount: %.1f%%\n", product1.discount * 100);
        System.out.printf("Final Price: $%.2f\n\n", product1.getFinalPrice(0.05));

        Product product2 = new Product("Pencil", 1.2);

        System.out.printf("--- %s ---\n", product2.name);
        System.out.printf("Price: $%.2f\n", product2.price);
        System.out.printf("Discount: %.1f%%\n", product2.discount * 100);
        System.out.printf("Final Price: $%.2f\n\n", product2.getFinalPrice());
    }
}
