package interfaceLabProg.paymentGateway;

class Stripe implements PaymentGateway {

    String stripe_id;
    Double balance;
    Double reward_percent;

    public Stripe(String stripe_id, Double balance, Double reward_percent) {
        this.stripe_id = stripe_id;
        this.balance = balance;
        this.reward_percent = reward_percent;
    }

    public String getStripe_id() {
        return stripe_id;
    }

    public void setStripe_id(String stripe_id) {
        this.stripe_id = stripe_id;
    }

    @Override
    public void processPayment(String user_id, Double payment_amount) {

        if (user_id.equals(stripe_id)){
            balance -= payment_amount;
            balance += payment_amount * (reward_percent / 100);
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

        if (user_id.equals(stripe_id)){
            balance += payment_amount;
            balance -= payment_amount * (reward_percent / 100);
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