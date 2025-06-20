import java.util.Random;

public class Withdrawer extends Thread {

    private final BankAccount account;
    private final Random random = new Random();

    public Withdrawer(BankAccount account) {
        super("Withdrawer");
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep( random.nextInt(1000) + 1000);
                double amount =  500000 + random.nextInt(1000000);
                account.withdraw(amount);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Withdrawer thread interrupted.");
            }
        }
    }
}
