package strategy.payment;

interface IPaymentStrategy {
    boolean initialization();
    void methodPayment(int total);
}
