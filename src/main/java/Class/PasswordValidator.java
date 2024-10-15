package Class;

import java.util.Scanner;

public class PasswordValidator {


    public static boolean isValidPassword(String password, String username, String oldPassword) {

        if (password.length() < 8) {
            return false;
        }


        boolean hasUppercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
                break;
            }
        }
                if (!hasUppercase) {
                    return false;
        }


        boolean hasSpecialChar = false;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
                break;
            }
        }
                    if (!hasSpecialChar) {
                     return false;
        }


        if (password.toLowerCase().contains(username.toLowerCase())) {
            return false;
        }


        if (password.equals(oldPassword)) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your old password: ");
        String oldPassword = scanner.nextLine();

        System.out.print("Enter your new password: ");
        String newPassword = scanner.nextLine();


        if (isValidPassword(newPassword, username, oldPassword)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid. Please ensure it meets all requirements.");
        }

        scanner.close();
    }
}

