package exceptionHandling.lab;

public class CustomExceptions {
    public static void main(String[] args) {
        FinancialApplication financialApp = new FinancialApplication();

        try {
            financialApp.processTransaction(8000.0, 4000.0);
        } catch (CreditLimitExceededException | TradingLimitExceededException e) {
            System.err.println("Transaction failed: " + e.getMessage());
        }
    }
}

class FinancialApplication {

    private static final double CREDIT_LIMIT = 10000.0;
    private static final double TRADING_LIMIT = 5000.0;


    public void processTransaction(double transactionAmount, double tradingAmount) throws CreditLimitExceededException, TradingLimitExceededException {
        if (transactionAmount > CREDIT_LIMIT) {
            throw new CreditLimitExceededException("Transaction amount exceeds credit limit!");
        }

        if (tradingAmount > TRADING_LIMIT) {
            throw new TradingLimitExceededException("Trading amount exceeds trading limit!");
        }

        System.out.println("The transaction and trading is successful.");
    }
}


class CreditLimitExceededException extends Exception {

    public CreditLimitExceededException() {
        super("Credit limit exceeded!");
    }

    public CreditLimitExceededException(String message) {
        super(message);
    }
}

class TradingLimitExceededException extends Exception {

    public TradingLimitExceededException() {
        super("Trading limit exceeded!");
    }

    public TradingLimitExceededException(String message) {
        super(message);
    }
}

