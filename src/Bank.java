import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void registerAccount(String accountNumber, String password, double initialBalance) {
        Account newAccount = new Account(accountNumber, password, initialBalance);
        accounts.add(newAccount);
    }

    public Account login(String accountNumber, String password) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber) && account.getPassword().equals(password)) {
                return account;
            }
        }
        System.out.println("Invalid account number or password.");
        return null;
    }
}
