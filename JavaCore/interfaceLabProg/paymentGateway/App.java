package interfaceLabProg.paymentGateway;

class App {
    public static void main(String[] args) {

        PayPal p = new PayPal("101pp", 2000.0);
        Stripe s = new Stripe("210s", 3000.0, 1.5);
        ApplePay a = new ApplePay("231aid", 5000.0, 5.0);

        System.out.println();
        System.out.println("Payment Providers' statements for a payment and refund of 5000.0 : ");
        p.processPayment("101pp", 5000.0);
        p.refundPayment("101pp", 5000.0);
        s.processPayment("210s", 5000.0);
        s.refundPayment("210s", 5000.0);
        a.processPayment("231aid", 5000.0);
        a.refundPayment("231aid", 5000.0);
    }
}