/*
 * Title: Product Class
 * Section: 05 
 * Lecture: 93, 97, 101
 */

package exercises;

public class Product {
    String name;
    double price;
    double discount;

    Product() {
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    double getFinalPrice() {
        return this.price * (1 - this.discount);
    }

    double getFinalPrice(double discountOfManager) {
        return this.price * (1 - (this.discount + discountOfManager));
    }
}
