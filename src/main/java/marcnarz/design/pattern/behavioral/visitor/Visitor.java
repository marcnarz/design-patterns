package marcnarz.design.pattern.behavioral.visitor;

public interface Visitor {

    void visit(Carrot carrot);

    void visit(Onion onion);

    void visit(Tomato tomato);
}
