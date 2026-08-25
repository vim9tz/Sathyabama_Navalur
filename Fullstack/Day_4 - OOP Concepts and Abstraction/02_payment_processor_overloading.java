/**
 * 02_payment_processor_overloading.java
 * Overloaded pay(...) methods supporting Cash, UPI, and Card channels.
 */
class PaymentProcessor {

    // Cash payment
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via CASH. Receipt generated.");
    }

    // UPI payment
    public void pay(double amount, String upiId) {
        System.out.println("Paid ₹" + amount + " via UPI (ID: " + upiId + "). Transaction successful.");
    }

    // Card payment
    public void pay(double amount, long cardNumber, int cvv) {
        long maskedCard = cardNumber % 10000;
        System.out.println("Paid ₹" + amount + " via CARD (Ending in *" + maskedCard + "). Transaction approved.");
    }
}

class _02_payment_processor_overloading {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        System.out.println("--- Payment Gateway Channels ---");
        processor.pay(450.00);
        processor.pay(1299.00, "user@okaxis");
        processor.pay(3499.00, 4532112233445566L, 892);
    }
}
