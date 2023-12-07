import book.BookList;
import user.ManageUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

// Main class responsible for handling user login and interaction with the BookList
public class Main {

    // Method for user login
    public static User login() {
        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Please enter your identity: 1. Administrator 2. General user");
        int choice = scanner.nextInt();

        // Create and return the appropriate user based on the selected identity
        if (choice == 1) {
            return new ManageUser(name); // Create a ManageUser instance for administrators
        } else {
            return new NormalUser(name); // Create a NormalUser instance for general users
        }
    }

    // Main method to start the program
    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login(); // Transition up

        // Main program loop for user interaction
        while (true) {
            int choice = user.menu(); // Display user menu and get user's choice

            System.out.println("Choice: " + choice);

            // Perform the selected operation based on the user's choice
            user.doOperation(choice, bookList);
        }
    }
}
