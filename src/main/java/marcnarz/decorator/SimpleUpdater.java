package marcnarz.decorator;

public class SimpleUpdater implements Updater {

    @Override
    public void update(Object object) {
        System.out.println("Updating...");
    }
}
