public class Withdraw {
    public static void withdraw(Account account, double amount) {
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful. New balance: " + account.getBalance());
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
    }
}
