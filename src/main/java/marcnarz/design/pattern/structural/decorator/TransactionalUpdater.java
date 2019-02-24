package marcnarz.design.pattern.structural.decorator;

public class TransactionalUpdater extends Decorator {

    public TransactionalUpdater(Updater updater) {
        super(updater);
    }

    @Override
    public void update(Object object) {
        System.out.println("Transaction start");
        super.update(object);
        System.out.println("Transaction end");
    }
}
