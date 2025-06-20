import java.util.Random;

public class Depositor extends Thread {

    private final BankAccount account;
    private final Random random = new Random();

    public Depositor(BankAccount account) {
        super("Depositor");
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(random.nextInt(1000) + 1000);
                double amount =  500000 + random.nextInt(1000000);
                account.deposit(amount);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Depositor thread interrupted.");
            }
        }
        account.deposit(0);
    }
}
