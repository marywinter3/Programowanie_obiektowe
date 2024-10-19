public class Main {
    public static void main(String[] args) {
        BankEmployee E1 = new BankEmployee("Alice", "adviser");

        String[] skills2 = { "interpersonal skills", "communication", "mentoring"};
        BankEmployee E2 = new BankEmployee("Adam", "manager", skills2);

        String[] skills3 = {"communication", "data analysis"};
        BankEmployee E3 = new BankEmployee("John", "adviser");

        BankEmployee E4 = new BankEmployee("George", "accountant");


        BankEmployee E5 = new BankEmployee();

        BankAccount A1 = new BankAccount(3000., E1);
        BankAccount A2 = new BankAccount(500342., E2);
        BankAccount A3 = new BankAccount(1500., E3);
        BankAccount A4 = new BankAccount(1500., E4);
        BankAccount A5 = new BankAccount(24378., E5);

        BankAccount.setInterestRate(0.035);
        A1.applyInterest();
        A2.applyInterest();
        A3.applyInterest();
        A4.applyInterest();
        A5.applyInterest();

        System.out.println(A1.toString());
        System.out.println(A2.toString());
        System.out.println(A3.toString());
        System.out.println(A4.toString());
        System.out.println(A5.toString());
    }
}