package marcnarz.design.pattern.decorator;

public class MetricUpdater extends Decorator {

    public MetricUpdater(Updater updater) {
        super(updater);
    }

    @Override
    public void update(Object object) {
        long t1 = System.currentTimeMillis();
        super.update(object);
        long t2 = System.currentTimeMillis();
        System.out.println("Update time " + (t2 - t1) + " ms");
    }
}
