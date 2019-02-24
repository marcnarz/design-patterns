package marcnarz.design.pattern.behavioral.observer;

public class ObserverPattern {

    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        ConcreteSubscriber subscriber1 = new ConcreteSubscriber();
        publisher.subscribe(subscriber1);

        ConcreteSubscriber subscriber2 = new ConcreteSubscriber();
        publisher.subscribe(subscriber2);

        publisher.notifySubscribers();
    }
}
