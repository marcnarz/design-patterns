package marcnarz.design.pattern.behavioral.observer;

public class ConcreteSubscriber implements Subscriber {

    @Override
    public void update(Publisher publisher) {
        System.out.println("ConcreteSubscriber - updated");
    }
}
