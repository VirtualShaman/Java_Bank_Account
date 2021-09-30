

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(1000, 5000);

        account1.addSavingsBalance(1000);

        account1.removeSavingsBalance(2000);

        System.out.println(account1.getCheckingBalance());

        System.out.println(account1.getSavingsBalance());

        System.out.println(account1.getAccountTotal());


    }
}