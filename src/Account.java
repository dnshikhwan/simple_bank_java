public class Account {
    private final String name;
    private float balance;

    public Account(String name, float balance) {
        this.name = name;
        this.balance = balance;
    }

    public float checkBalance() {
        return balance;
    }

    public void deposit(float amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0");
            return;
        }
        this.balance = this.balance + amount;
    }

    public void withdraw(float amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than 0");
            return;
        }

        if (amount > balance) {
            System.out.println("Not enough money");
            return;
        }

        this.balance -= amount;
    }

    public String getName() {
        return name;
    }
}
