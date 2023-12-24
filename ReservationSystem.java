import java.util.Scanner;

public class ReservationSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Login Form
        System.out.println("Online Reservation System - Login Form");
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (isValidUser(username, password)) {
            System.out.println("Login successful! Welcome to the Reservation System.");
            // Call the main menu or other relevant functionality here
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    private static boolean isValidUser(String username, String password) {
        // Implement your authentication logic here
        // For simplicity, consider a predefined username and password
        return username.equals("karuna") && password.equals("karuna123");
    }
}