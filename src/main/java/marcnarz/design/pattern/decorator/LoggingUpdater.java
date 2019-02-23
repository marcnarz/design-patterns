package marcnarz.decorator;

public class LoggingUpdater extends Decorator {

    public LoggingUpdater(Updater updater) {
        super(updater);
    }

    @Override
    public void update(Object object) {
        System.out.println("Object to update [" + object + "]");
        super.update(object);
    }
}
