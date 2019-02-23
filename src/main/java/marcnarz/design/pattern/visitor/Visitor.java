package marcnarz.design.pattern.visitor;

public interface Visitor {

    void visit(Carrot carrot);

    void visit(Onion onion);

    void visit(Tomato tomato);
}
