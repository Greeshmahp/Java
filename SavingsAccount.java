import java.util.Scanner;

public class SavingsAccount {
    public static void main(String[] args) {
        int balance = 60000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("State Bank of India");
        System.out.println("Your balance is: " + balance);
        System.out.println("1. Deposit money");
        System.out.println("2. Check balance");
        System.out.println("3. Withdraw money");
        System.out.println("4. Exit");

        while (true) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {

                System.out.print("Deposit Amount: ");
                int deposit = scanner.nextInt();
                balance += deposit;
                System.out.println("You have deposited:" + deposit);
                System.out.println("Your current balance is:"+ balance);
            } 
            else if (choice == 2) {
                
                System.out.println("Your current balance is:" + balance);
            }
            else if (choice == 3) 
            {
                
                System.out.print("Withdraw amount:");
                int withdraw = scanner.nextInt();
                balance -= withdraw;
                System.out.println("You have withdrawn:"+ withdraw);
                System.out.println("Your current balance is:"+ balance);
            } 
            else if (choice == 4)
            {
                System.out.println("Transaction Successful");
                break;
            }
            else
            {
                System.out.println("Invalid choice, please enter 1, 2, 3 or 4");
                
            }
        }
        scanner.close();
    }
}
