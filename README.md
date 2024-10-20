ATM Interface Java Project

This Java project simulates a basic ATM interface, allowing users to sign up, log in, and perform various banking operations.

Importing Libraries


//* import java.util.ArrayList;

//* import java.util.Scanner;


The code imports two libraries:

- java.util.ArrayList: For storing and managing collections of data (e.g., user information).
- java.util.Scanner: For reading user input.

Class Declaration


public class AtmInterface {
}

The AtmInterface class contains the main logic for the ATM simulation.

Static Variables


static ArrayList<String> user = new ArrayList<>();

static ArrayList<String> mails = new ArrayList<>();

static ArrayList<String> phnno = new ArrayList<>();

static ArrayList<String> pas = new ArrayList<>();

static ArrayList<Integer> acc = new ArrayList<>();

static Scanner scanner = new Scanner(System.in);


The code declares six static variables:

- user: Stores usernames.
- mails: Stores email addresses.
- phnno: Stores phone numbers.
- pas: Stores passwords.
- acc: Stores account balances.
- scanner: Reads user input.

Signup Function


public static void signup() {
    // ...
}


The signup() function:

1. Prompts the user to enter a username, password, confirm password, email, phone number, and deposit amount.
2. Checks if the username already exists.
3. Verifies password matching.
4. Adds the new user's information to the respective ArrayLists.

Main Method


public static void main(String[] args) {
    // ...
}


The main() method:

1. Initializes the ArrayLists with default user data.
2. Enters an infinite loop, prompting the user to log in or sign up.
3. Handles login functionality:
    - Checks if the username exists.
    - Verifies password matching.
    - Displays the ATM menu (withdraw, deposit, check balance, logout).
4. Handles signup functionality by calling the signup() function.

ATM Operations

The ATM menu offers four options:

1. Withdraw: Prompts the user to enter the withdrawal amount and updates the account balance.
2. Deposit: Prompts the user to enter the deposit amount and updates the account balance.
3. Check Balance: Displays the current account balance.
4. Logout: Exits the ATM menu.

This code provides a basic implementation of an ATM interface, demonstrating user authentication, data storage, and banking operations.
