import java.util.ArrayList;
import java.util.Scanner;

public class AtmInterface {

    // Initialize user data using ArrayLists
    static ArrayList<String> user = new ArrayList<>();
    static ArrayList<String> mails = new ArrayList<>();
    static ArrayList<String> phnno = new ArrayList<>();
    static ArrayList<String> pas = new ArrayList<>();
    static ArrayList<Integer> acc = new ArrayList<>();
    
    static Scanner scanner = new Scanner(System.in);

    // Signup function
    public static void signup() {
        System.out.print("Enter username: ");
        String name = scanner.next();

        // Check if the username already exists
        if (user.contains(name)) {
            System.out.println("Username already exists. Please choose a different one.");
            return;
        }

        System.out.print("Enter password: ");
        String password = scanner.next();
        System.out.print("Enter confirm password: ");
        String confirmPassword = scanner.next();

        // Check if passwords match
        if (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match. Please try again.");
            return;
        }

        System.out.print("Enter mail id: ");
        String mail = scanner.next();
        System.out.print("Enter phone number: ");
        String phoneNum = scanner.next();
        System.out.print("Enter deposit amount: ");
        int amount = scanner.nextInt();

        // Add new user data
        user.add(name);
        pas.add(password);
        mails.add(mail);
        phnno.add(phoneNum);
        acc.add(amount);

        System.out.println("Signup successful!");
    }

    // Main method to simulate the ATM interface
    public static void main(String[] args) {
        // Add some default users
        user.add("a"); user.add("b"); user.add("c"); user.add("d");
        mails.add("a@gmail.com"); mails.add("b@gmail.com"); mails.add("c@gmail.com"); mails.add("d@gmail.com");
        phnno.add("9848485773"); phnno.add("3859274644"); phnno.add("2937593758"); phnno.add("9346226370");
        pas.add("123"); pas.add("456"); pas.add("789"); pas.add("101");
        acc.add(100); acc.add(200); acc.add(300); acc.add(400);

        while (true) {
            System.out.print("Do you want to login or signup? ");
            String choice = scanner.next().toLowerCase();

            if (choice.equals("login")) {
                System.out.print("Enter your username: ");
                String username = scanner.next();

                // Check if username exists
                if (user.contains(username)) {
                    int index = user.indexOf(username);
                    System.out.print("Enter your password: ");
                    String password = scanner.next();

                    // Verify the password
                    if (pas.get(index).equals(password)) {
                        System.out.println("Login successful!");

                        // ATM operations loop
                        while (true) {
                            System.out.print("Enter your choice (1: Withdraw, 2: Deposit, 3: Check Balance, 4: Logout): ");
                            int action = scanner.nextInt();

                            switch (action) {
                                case 1: // Withdraw
                                    System.out.print("Enter the amount to withdraw: ");
                                    int withdrawAmount = scanner.nextInt();
                                    if (withdrawAmount > acc.get(index)) {
                                        System.out.println("Insufficient balance.");
                                    } else {
                                        acc.set(index, acc.get(index) - withdrawAmount);
                                        System.out.println("Withdrawal successful! New balance: " + acc.get(index));
                                    }
                                    break;

                                case 2: // Deposit
                                    System.out.print("Enter the amount to deposit: ");
                                    int depositAmount = scanner.nextInt();
                                    acc.set(index, acc.get(index) + depositAmount);
                                    System.out.println("Deposit successful! New balance: " + acc.get(index));
                                    break;

                                case 3: // Check balance
                                    System.out.println("Your current balance is: " + acc.get(index));
                                    break;

                                case 4: // Logout
                                    System.out.println("Logged out successfully.");
                                    return;

                                default:
                                    System.out.println("Invalid choice. Please choose a valid option.");
                                    break;
                            }
                        }
                    } else {
                        System.out.println("Incorrect password. Please try again.");
                    }
                } else {
                    System.out.println("Username not found.");
                }

            } else if (choice.equals("signup")) {
                signup(); // Call the signup function

            } else {
                System.out.println("Invalid option. Please choose 'login' or 'signup'.");
            }
        }
    }
}

