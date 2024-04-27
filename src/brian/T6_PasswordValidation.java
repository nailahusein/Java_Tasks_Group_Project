package brian;

import java.util.Scanner;

public class T6_PasswordValidation {

    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 6) {
            return false; // Check for minimum length
        }
        if (password.contains(" ")) {
            return false; // Check for spaces
        }
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false; //instantiate boolean variables

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true; // Assuming all other characters are special characters
        }

        return hasUpper && hasLower && hasDigit && hasSpecial; // Return true if all boolean variables are true
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        while (true) { // Infinite loop to keep asking for password until valid
            System.out.println("Enter password: ");
            String password = scanner.nextLine(); // Read user input
            if (isValidPassword(password)) {
                System.out.println("This password is valid.");
                break; // Exit the loop if the password is valid
            } else {
                System.err.println("This password is not valid. Please try again.");
            }
        }

        scanner.close(); // Close the scanner
    }
}