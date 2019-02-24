package marcnarz.design.pattern.structural.composite.proxy;

import java.util.Collection;

public class CachedPaymentService implements PaymentService {

    private final PaymentService paymentService;

    private Collection<Object> operations;

    public CachedPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public Collection<Object> getOperations() {
        if (operations == null) {
            System.out.println("Initialize operations...");
            operations = paymentService.getOperations();
        }
        System.out.println("Collection of operations " + operations);
        return operations;
    }
}
