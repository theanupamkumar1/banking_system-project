public class Deposit {
    public static void deposit(Account account, double amount) {
        account.deposit(amount);
        System.out.println("Deposit successful. New balance: " + account.getBalance());
    }
}
