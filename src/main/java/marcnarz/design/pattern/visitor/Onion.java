package marcnarz.design.pattern.visitor;

public class Onion implements Product {

    @Override
    public void calculateDiscount(Visitor visitor) {
        visitor.visit(this);
    }
}
