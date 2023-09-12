package interfaceLabProg.paymentGateway;

public interface PaymentGateway {

    void processPayment(String user_id, Double payment_amount);
    void refundPayment(String user_id, Double payment_amount);
}