class Account {
    String owner;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void display() {
        System.out.println(owner + ": " + balance);
    }
}

public class OOPFeatures {
    public static void main(String[] args) {
        Account account = new Account();
        account.owner = "Ankur";
        account.deposit(5000);
        account.display();
    }
}
