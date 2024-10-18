public class Main {
    public static void main(String[] args) {
        BankAccount B1 = new BankAccount(2400.);
        BankAccount B2 = new BankAccount(35200.);
        BankAccount B3 = new BankAccount(100.);
        BankAccount B4 = new BankAccount(7580.);
        BankAccount B5 = new BankAccount(24000.);

        System.out.println("\nInitial balances in dollars:");
        System.out.println(B1.toString());
        System.out.println(B2.toString());
        System.out.println(B3.toString());
        System.out.println(B4.toString());
        System.out.println(B5.toString());

        B1.deposit(100.);
        B2.deposit(1530.);

        B3.withdraw(50.);
        B4.withdraw(2500.);

        System.out.println("\nBalances after withdrawals and deposits:");
        System.out.println(B1.toString());
        System.out.println(B2.toString());
        System.out.println(B3.toString());
        System.out.println(B4.toString());
        System.out.println(B5.toString());

        B1.applyInterest();
        B2.applyInterest();
        B3.applyInterest();
        B4.applyInterest();
        B5.applyInterest();

        System.out.println("\nBalances after applying interest:");
        System.out.println(B1.toString());
        System.out.println(B2.toString());
        System.out.println(B3.toString());
        System.out.println(B4.toString());
        System.out.println(B5.toString());

        double irate = 0.02;
        BankAccount.setInterestRate(irate);
        B1.applyInterest();
        B2.applyInterest();
        B3.applyInterest();
        B4.applyInterest();
        B5.applyInterest();

        System.out.println("\nBalances after changing interest rate:");
        System.out.println(B1.toString());
        System.out.println(B2.toString());
        System.out.println(B3.toString());
        System.out.println(B4.toString());
        System.out.println(B5.toString());

        double euro_rate = 0.9;

        System.out.println("\nBalances in euro:\n" +
                BankAccount.BankAccountHelper.convertCurrency(B1.getBalance(), euro_rate) + "\n" +
                BankAccount.BankAccountHelper.convertCurrency(B2.getBalance(), euro_rate) + "\n" +
                BankAccount.BankAccountHelper.convertCurrency(B3.getBalance(), euro_rate) + "\n" +
                BankAccount.BankAccountHelper.convertCurrency(B4.getBalance(), euro_rate) + "\n" +
                BankAccount.BankAccountHelper.convertCurrency(B5.getBalance(), euro_rate) + "\n");
    }
}