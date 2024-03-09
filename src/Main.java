    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Bank bank = new Bank();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter account number: ");
                        String accNum = scanner.next();
                        System.out.print("Enter password: ");
                        String password = scanner.next();
                        System.out.print("Enter initial balance: ");
                        double initialBalance = scanner.nextDouble();
                        bank.registerAccount(accNum, password, initialBalance);
                        System.out.println("Account registered successfully!");
                        break;


                    case 2:
                        System.out.print("Enter account number: ");
                        String loginAccNum = scanner.next();
                        System.out.print("Enter password: ");
                        String loginPassword = scanner.next();
                        Account loggedInAccount = bank.login(loginAccNum, loginPassword);

                        if (loggedInAccount != null) {
                            // User is logged in, perform operations like deposit, withdraw, or inquiry
                            System.out.println("4. Deposit");
                            System.out.println("5. Withdraw");
                            System.out.println("6. Inquiry");
                            System.out.print("Choose an operation: ");
                            int operationChoice = scanner.nextInt();

                            switch (operationChoice) {
                                case 4:
                                    System.out.print("Enter deposit amount: ");
                                    double depositAmount = scanner.nextDouble();
                                    Deposit.deposit(loggedInAccount, depositAmount);
                                    break;

                                case 5:
                                    System.out.print("Enter withdrawal amount: ");
                                    double withdrawAmount = scanner.nextDouble();
                                    Withdraw.withdraw(loggedInAccount, withdrawAmount);
                                    break;

                                case 6:
                                    Inquiry.inquire(loggedInAccount);
                                    break;

                                default:
                                    System.out.println("Invalid operation choice.");
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Exiting the program.");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
