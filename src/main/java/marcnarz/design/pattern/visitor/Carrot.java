package marcnarz.design.pattern.visitor;

public class Carrot implements Product {

    @Override
    public void calculateDiscount(Visitor visitor) {
        visitor.visit(this);
    }
}
