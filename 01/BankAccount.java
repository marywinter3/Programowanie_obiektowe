import java.lang.StringBuilder;

/**
 * Represents a bank account.
 */
public class BankAccount {
    private static double interestRate = 0.03;
    private double balance;

    /**
     * Constructor
     * @param balance Balance of an account.
     */
    BankAccount(double balance) {
        this.balance = balance;
    }

    static {
        System.out.println("Welcome to the banking system!");
    }

    /**
     * Changes the balance after depositing money.
     * @param amount Amount of money to deposit.
     */
    void deposit(double amount) {
        this.balance += amount;
    }

    /**
     * Changes the balance after withdrawing money.
     * @param amount Amonut of money to withdraw.
     */
    void withdraw(double amount) {
        this.balance -= amount;
    }

    /**
     * Applies the interest rate changing the balance.
     */
    void applyInterest() {
        this.balance += this.balance * interestRate;
    }

    /**
     * Sets interest rate.
     * @param value New value of interest rate.
     */
    static void setInterestRate(double value) {
        interestRate = value;
    }

    /**
     * Gets the value of balance.
     * @return Returns value of balance.
     */
    double getBalance() {
        return this.balance;
    }

    static class BankAccountHelper {
        /**
         * Converts value of balance from one currency to another.
         * @param amount Amount of money to convert.
         * @param rate Exchange rate to convert the currency.
         * @return Returns the converted value.
         */
        static String convertCurrency(double amount, double rate) {
            return String.format("%.2f", rate * amount);
        }
    }

    /**
     *
     * @return Returns information about an account as a String.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("Balance: ");
        sb.append(String.format("%.2f", this.balance));
        return sb.toString();
    }
}
