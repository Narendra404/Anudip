package interfaceLabProg.paymentGateway;

class PayPal implements PaymentGateway {

    private String paypal_id;
    private Double balance;

    public PayPal(String paypal_id, Double balance) {
        this.paypal_id = paypal_id;
        this.balance = balance;
    }

    public String getPaypal_id() {
        return paypal_id;
    }

    public void setPaypal_id(String paypal_id) {
        this.paypal_id = paypal_id;
    }

    @Override
    public void processPayment(String user_id, Double payment_amount) {

        if (user_id.equals(paypal_id)){
            balance -= payment_amount;
            System.out.println();
            System.out.println("The payment is processed successfully.");
            System.out.println("The updated balance of the user : " + user_id + " is : " + balance);
            System.out.println();
        }
        else {
            System.out.println();
            System.out.println("The payment is not processed successfully.");
            System.out.println("Wrong user ID.");
            System.out.println();
        }
    }

    @Override
    public void refundPayment(String user_id, Double payment_amount) {

        if (user_id.equals(paypal_id)){
            balance += payment_amount;
            System.out.println();
            System.out.println("The payment is refunded successfully.");
            System.out.println("The updated balance of the user : " + user_id + " is : " + balance);
            System.out.println();
        }
        else {
            System.out.println();
            System.out.println("The payment is not refunded successfully.");
            System.out.println("Wrong user ID.");
            System.out.println();
        }

    }
}