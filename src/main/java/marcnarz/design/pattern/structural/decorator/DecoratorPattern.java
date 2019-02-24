package marcnarz.design.pattern.structural.decorator;

public class DecoratorPattern {

    public static void main(String[] args) {
        SimpleUpdater simpleUpdater = new SimpleUpdater();
        LoggingUpdater loggingUpdater = new LoggingUpdater(simpleUpdater);
        TransactionalUpdater transactionalUpdater = new TransactionalUpdater(loggingUpdater);
        MetricUpdater metricUpdater = new MetricUpdater(transactionalUpdater);

        String object = "{\"id\":\"1\",\"text\":\"any text\"}";
        metricUpdater.update(object);
    }
}
