package marcnarz.design.pattern.visitor;

public class BigDiscounter implements Visitor {

    @Override
    public void visit(Carrot carrot) {
        System.out.println("Carrot discount 12%");
    }

    @Override
    public void visit(Onion onion) {
        System.out.println("Onion discount 17%");
    }

    @Override
    public void visit(Tomato tomato) {
        System.out.println("Tomato discount 30%");
    }
}
