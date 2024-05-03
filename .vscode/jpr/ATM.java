import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        double balance = 1000;
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("check balance");
                    System.out.println("Your balance is: $" + balance);
                    break;
                case 2:
                    System.out.println("deposit");
                    System.out.print("Enter the amount to deposit: $");
                    double amount = sc.nextDouble();
                    balance += amount;
                    System.out.println("Deposit of $" + amount + " successful.");
                    break;
                case 3:
                    System.out.println("withdraw");
                    System.out.print("Enter the amount to withdraw: $");
                    double amount1 = sc.nextDouble();
                    if (amount1 > balance) {
                        System.out.println("Insufficient funds. Withdrawal failed.");
                    } else {
                        balance -= amount1;
                        System.out.println("Withdrawal of $" + amount1 + " successful.");
                    }
                    break;
                case 4:
                    System.out.println("exit from ATM");
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 4);
        sc.close();
    }

}