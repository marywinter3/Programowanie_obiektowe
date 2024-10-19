/**
 * Represents bank account.
 * Each account has unique number.
 */
public class BankAccount {
    double balance;
    BankEmployee owner;
    static int accountNumber = 0;

    static double interestRate = 0.;
    static {
        interestRate = 0.025;
    }

    /**
     * Constructor
     * @param balance Balance of an account.
     * @param owner Owner of an Account.
     */
    public BankAccount(double balance, BankEmployee owner) {
        this.balance = balance;
        this.owner = owner;
        accountNumber++;
    }

    /**
     * Constructor setting default values.
     */
    public BankAccount() {
        this.balance = 0;
        this.owner = new BankEmployee();
        accountNumber++;
    }

    /**
     * Sets new interest rate.
     * @param newRate New value of an interest rate.
     */
    static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    /**
     * Applies new value of an interest rate.
     * Changes value of balance.
     */
    void applyInterest() {
        this.balance += this.balance * interestRate;
    }

    /**
     *
     * @return Returns information about an account as a String.
     */
    public String toString() {
        return("Balance: " + this.balance + "\n\nOwner:\n" + this.owner.toString() + "---------------------------");
    }
}
