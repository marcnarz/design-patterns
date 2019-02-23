package marcnarz.design.pattern.proxy;

import java.util.Arrays;
import java.util.Collection;

public class SimplePaymentService implements PaymentService {

    @Override
    public Collection<Object> getOperations() {
        return Arrays.asList("operation1", "operation2", "operation3");
    }
}
