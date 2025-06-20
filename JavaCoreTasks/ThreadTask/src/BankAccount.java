public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        System.out.println(Thread.currentThread().getName() + " is depositing: " + amount);
        balance += amount;
        System.out.println("New balance after deposit: " + balance);
        notifyAll();  //notify any waiting threads
    }

    public synchronized void withdraw(double amount) {
        while (balance < amount) {
            System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount + ", but balance is only " + balance + ". Waiting...");
            try {
                wait(); // Wait for a deposit
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Withdrawal thread interrupted.");
            }
        }
        System.out.println(Thread.currentThread().getName() + " is withdrawing: " + amount);
        balance -= amount;
        System.out.println("New balance after withdrawal: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}