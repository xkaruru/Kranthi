
interface Payment {
    void pay();
}

class CreditCardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Processing credit card payment...");
    }
}

class PayPalPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Processing PayPal payment...");
    }
}

class PaymentFactory {
    public static Payment createPayment(String type) {
        if (type.equalsIgnoreCase("CreditCard")) {
            return new CreditCardPayment();
        } else if (type.equalsIgnoreCase("PayPal")) {
            return new PayPalPayment();
        }
        throw new IllegalArgumentException("Invalid payment type: " + type);
    }
}

public class Fact{
    public static void main(String[] args) {
        Payment creditCardPayment = PaymentFactory.createPayment("CreditCard");
        creditCardPayment.pay();
        Payment payPalPayment = PaymentFactory.createPayment("PayPal");
        payPalPayment.pay();
    }
}
