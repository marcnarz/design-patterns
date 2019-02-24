package marcnarz.design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Bucket implements Product {

    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void calculateDiscount(Visitor visitor) {
        for (Product product : products) {
            product.calculateDiscount(visitor);
        }
    }
}
