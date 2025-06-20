
public class Main {
    public static void main(String[] args) throws InterruptedException {

        BankAccount bankAccount = new BankAccount(1000);
        Depositor depositor = new Depositor(bankAccount);
        Withdrawer withdrawer = new Withdrawer(bankAccount);
        depositor.start();
        withdrawer.start();


        depositor.join();
        withdrawer.join();

        System.out.println("Final balance: " + bankAccount.getBalance());
        System.out.println("Main thread finished.");


    }

}