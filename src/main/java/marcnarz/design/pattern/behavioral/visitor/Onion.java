package marcnarz.design.pattern.behavioral.visitor;

public class Onion implements Product {

    @Override
    public void calculateDiscount(Visitor visitor) {
        visitor.visit(this);
    }
}
