package marcnarz.design.pattern.proxy;

public class ProxyPattern {

    public static void main(String[] args) {
        SimplePaymentService simplePaymentService = new SimplePaymentService();
        PaymentService proxy = new CachedPaymentService(simplePaymentService);
        proxy.getOperations();
        proxy.getOperations();
    }
}
