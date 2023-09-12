package interfaceLabProg.paymentGateway;

class ApplePay implements PaymentGateway {

    String apple_id;
    Double balance;
    Double transaction_charge;

    public ApplePay(String apple_id, Double balance, Double transaction_charge) {
        this.apple_id = apple_id;
        this.balance = balance;
        this.transaction_charge = transaction_charge;
    }

    public String getApple_id() {
        return apple_id;
    }

    public void setApple_id(String apple_id) {
        this.apple_id = apple_id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getTransaction_charge() {
        return transaction_charge;
    }

    public void setTransaction_charge(Double transaction_charge) {
        this.transaction_charge = transaction_charge;
    }

    @Override
    public void processPayment(String user_id, Double payment_amount) {

        if (user_id.equals(apple_id)){
            balance -= payment_amount;
            balance -= transaction_charge;
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

        if (user_id.equals(apple_id)){
            balance += payment_amount;
            balance -= transaction_charge;
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