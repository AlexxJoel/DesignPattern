package strategy.payment;

public class CashStrategy implements IPaymentStrategy{

    @Override
    public boolean initialization() {
        System.out.println("Cash payment method initialized successfully");
        return false;
    }

    @Override
    public void methodPayment(int total) {
        System.out.println("Total: $" + total);
        System.out.println("Paying "+ total +"...");
        System.out.println("Payment made successfully");
    }
}
