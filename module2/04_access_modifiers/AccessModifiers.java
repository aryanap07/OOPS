class Account {
    private double balance;
    protected String owner;
    public String bankName;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Account account = new Account();

        account.owner = "Aman";
        account.bankName = "Example Bank";
        account.deposit(1000);

        System.out.println(account.owner);
        System.out.println(account.bankName);
        System.out.println(account.getBalance());
    }
}
