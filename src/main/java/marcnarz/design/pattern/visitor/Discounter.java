package marcnarz.design.pattern.visitor;

public class Discounter implements Visitor {

    @Override
    public void visit(Carrot carrot) {
        System.out.println("Carrot discount 5%");
    }

    @Override
    public void visit(Onion onion) {
        System.out.println("Onion discount 7%");
    }

    @Override
    public void visit(Tomato tomato) {
        System.out.println("Tomato discount 10%");
    }
}
