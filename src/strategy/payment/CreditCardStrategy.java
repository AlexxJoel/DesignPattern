package strategy.payment;

import java.util.Scanner;

public class CreditCardStrategy implements IPaymentStrategy{

    Scanner scanner = new Scanner(System.in);
    @Override
    public boolean initialization() {
        System.out.println("Credit card payment method initialized successfully");
        return false;
    }

    @Override
    public void methodPayment(int total) {
        System.out.println("Total: $" + total);
        System.out.println("Swipe your credit card");
        System.out.println("validating credit card...");
        System.out.println("Credit card validated successfully");
        System.out.println("Paying "+ total +"...");
        System.out.println("Payment made successfully");
    }
}
