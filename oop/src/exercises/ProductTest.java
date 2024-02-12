/*
 * Title: Product Class Test
 * Section: 05 
 * Lecture: 93
 */

package exercises;

public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Notebook";
        product1.price = 4567.98;
        product1.discount = 0.05;

        double product1FinalPrice = product1.price * (1 - product1.discount);

        System.out.printf("--- %s ---\n", product1.name);
        System.out.printf("Price: $%.2f\n", product1.price);
        System.out.printf("Discount: %.1f%%\n", product1.discount * 100);
        System.out.printf("Final Price: $%.2f\n\n", product1FinalPrice);

        Product product2 = new Product();
        product2.name = "Pencil";
        product2.price = 1.2;
        product2.discount = 0.01;

        double product2FinalPrice = product2.price * (1 - product2.discount);

        System.out.printf("--- %s ---\n", product2.name);
        System.out.printf("Price: $%.2f\n", product2.price);
        System.out.printf("Discount: %.1f%%\n", product2.discount * 100);
        System.out.printf("Final Price: $%.2f\n\n", product2FinalPrice);
    }
}
