package marcnarz.design.pattern.behavioral.visitor;

public class Carrot implements Product {

    @Override
    public void calculateDiscount(Visitor visitor) {
        visitor.visit(this);
    }
}
