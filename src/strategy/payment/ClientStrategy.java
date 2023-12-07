package strategy.payment;

import java.util.ArrayList;

public class ClientStrategy {
    public static void main(String[] args) {

        int option = 3;
        ArrayList<String> productList = new ArrayList<>(){{
            add("Papas - $15");
            add("Galletas - $42");
            add("Gomitas - $10");
        }};

        int total = 67;

        System.out.println("Your products are: " + productList.toString() + '\n' + "Total: $" + total );
        System.out.println("Choose a payment method: 1. Cash, 2. Credit Card, 3. Cancel");

        IPaymentStrategy paymentStrategy = null;
        ContextStrategy contextStrategy = new ContextStrategy(paymentStrategy);

        if (option == 1) {
            paymentStrategy = new CashStrategy();
            contextStrategy.setStrategy(paymentStrategy);
        } else if (option == 2) {
            paymentStrategy = new CreditCardStrategy();
            contextStrategy.setStrategy(paymentStrategy);
        } else {
            System.out.println("Canceling payment");
            System.exit(0);
        }

        paymentStrategy.methodPayment(total);


    }
}
