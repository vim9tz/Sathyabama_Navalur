/**
 * 10_payment_gateway_interface.java
 * Demonstrates full abstraction via Java interface contracts and implements keyword.
 */
interface PaymentGatewayContract {
    // Interface fields are implicitly public static final
    String CURRENCY = "INR";

    // Interface methods are implicitly public abstract
    void initiatePayment(double amount);
    boolean verifyStatus(String transactionId);
}

class UpiPaymentGateway implements PaymentGatewayContract {
    private String upiHandle;

    UpiPaymentGateway(String upiHandle) {
        this.upiHandle = upiHandle;
    }

    @Override
    public void initiatePayment(double amount) {
        System.out.println("UPI Gateway: Initiating transfer of " + CURRENCY + " " + amount + " via " + upiHandle);
    }

    @Override
    public boolean verifyStatus(String transactionId) {
        System.out.println("UPI Gateway: Verifying transaction status for Txn ID [" + transactionId + "] -> SUCCESS");
        return true;
    }
}

class CardPaymentGateway implements PaymentGatewayContract {
    private long cardNumber;

    CardPaymentGateway(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void initiatePayment(double amount) {
        System.out.println("Card Gateway: Authorizing " + CURRENCY + " " + amount + " on Card [*" + (cardNumber % 10000) + "]");
    }

    @Override
    public boolean verifyStatus(String transactionId) {
        System.out.println("Card Gateway: Verifying clearance for Txn ID [" + transactionId + "] -> SETTLED");
        return true;
    }
}

class _10_payment_gateway_interface {
    public static void main(String[] args) {
        PaymentGatewayContract gateway1 = new UpiPaymentGateway("merchant@paytm");
        PaymentGatewayContract gateway2 = new CardPaymentGateway(5412751122339988L);

        System.out.println("--- Payment Gateway Interfaces ---");
        gateway1.initiatePayment(1500.00);
        gateway1.verifyStatus("UPI-88912");

        System.out.println();
        gateway2.initiatePayment(4999.00);
        gateway2.verifyStatus("CARD-44102");
    }
}
