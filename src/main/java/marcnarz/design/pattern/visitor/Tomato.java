package marcnarz.design.pattern.visitor;

public class Tomato implements Product {

    @Override
    public void calculateDiscount(Visitor visitor) {
        visitor.visit(this);
    }
}
