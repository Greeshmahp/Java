
import java.util.Scanner;

public class SavingsAccountNew {
    public static void main(String[] args) {
        String accountNumber1 = "398599";
        String password1 = "abc";
        int balance1 = 60000;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Account Number: ");
            String enterNum = scanner.nextLine();
            System.out.print("Enter Password: ");
            String enterPass = scanner.nextLine();

            
            if (enterNum.equals(accountNumber1) && enterPass.equals(password1)) {
                System.out.println("Account verified successfully.");

                boolean exit = false;
               
                while (!exit) {
                    System.out.println("Your balance is: " + balance1);
                    System.out.println("1. Deposit money");
                    System.out.println("2. Check balance");
                    System.out.println("3. Withdraw money");
                    System.out.println("4. Exit");

                    System.out.print("Enter your choice: ");
                    int choice = scanner.nextInt();

                    
                    scanner.nextLine(); 

                    switch (choice) {
                        case 1:
                            System.out.print("Deposit Amount: ");
                            int deposit = scanner.nextInt();
                            scanner.nextLine(); 
                            balance1 += deposit;
                            System.out.println("You have deposited: " + deposit);
                            break;
                        
                        case 2:
                            System.out.println("Your current balance is: " + balance1);
                            break;

                        case 3:
                            System.out.print("Withdraw Amount: ");
                            int withdraw = scanner.nextInt();
                            scanner.nextLine(); 

                            if (withdraw > balance1) {
                                System.out.println("Insufficient funds. You cannot withdraw more than your current balance.");
                            } else {
                                balance1 -= withdraw;
                                System.out.println("You have withdrawn: " + withdraw);
                            }
                            break;

                        case 4:
                            System.out.println("Transaction Successful. Exiting...");
                            exit = true; 
                            break;

                        default:
                            System.out.println("Invalid option. Please try again.");
                    }
                }
            } else {
                System.out.println("Invalid account number or password. Please try again.");
            }
        }

    }
}
