package strategy.payment;

public class ContextStrategy {

    private IPaymentStrategy paymentStrategy;

    public ContextStrategy(IPaymentStrategy paymentStrategy) {
        setStrategy(paymentStrategy);

    }
    public void setStrategy(IPaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
        System.out.println(this.paymentStrategy.initialization()?"Payment method initialized successfully":"Payment method failed to initialize");
    }

    boolean payCount( int total){
        this.paymentStrategy.methodPayment(total);
        return true;
    }
}
