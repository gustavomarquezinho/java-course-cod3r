/*
 * Title: Product Class
 * Section: 05 
 * Lecture: 93, 97
 */

package exercises;

public class Product {
    String name;
    double price;
    double discount;

    double getFinalPrice() {
        return this.price * (1 - this.discount);
    }

    double getFinalPrice(double discountOfManager) {
        return this.price * (1 - (this.discount + discountOfManager));
    }
}
