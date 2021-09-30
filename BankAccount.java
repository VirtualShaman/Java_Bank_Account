

public class BankAccount {

    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts = 0;
    private static double totalAccountsBalance;
    
    public BankAccount(double cBalance, double sBalance){
        this.checkingBalance = cBalance;
        this.savingsBalance = sBalance;
        this.numberOfAccounts++;
        this.totalAccountsBalance = cBalance + sBalance;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void addCheckingBalance(double deposit) {
        this.checkingBalance += deposit;
        this.totalAccountsBalance += deposit;
    }

    public void addSavingsBalance(double deposit) {
        this.savingsBalance += deposit;
        this.totalAccountsBalance += deposit;
    }

    public void removeCheckingBalance(double withdraw) {
        this.checkingBalance -= withdraw;
        this.totalAccountsBalance -= withdraw;
    }

    public void removeSavingsBalance(double withdraw) {
        this.savingsBalance -= withdraw;
        this.totalAccountsBalance -= withdraw;
    }

    public double getAccountTotal() {
        return this.totalAccountsBalance;
    }


}