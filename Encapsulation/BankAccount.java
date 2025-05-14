
public class BankAccount {

    private int accountNumber = 1234567;
    private double balance = 6700000;

    public int getAccountNumber() {
        return accountNumber;

    }

    public double getBalance() {
        return balance;

    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public static void main(String[] args) {

        BankAccount ac1 = new BankAccount();
        System.out.println(ac1.getAccountNumber());
        // ac1.setBalance(200000);
        System.out.println(ac1.getBalance());

    }
}
