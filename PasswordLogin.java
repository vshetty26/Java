import java.util.Scanner;


class TooManyAttemptsException extends Exception {
    public TooManyAttemptsException(String message) {
        super(message);
    }
}

public class PasswordLogin {
    private static final String CORRECT_PASSWORD = "SecurePass123";
    private static final int MAX_ATTEMPTS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your password: ");
            String inputPassword = scanner.nextLine();

            if (inputPassword.equals(CORRECT_PASSWORD)) {
                System.out.println("Login Successful");
                scanner.close();
                return;
            } else {
                attempts++;
                System.out.println("Incorrect password. Attempts left: " + (MAX_ATTEMPTS - attempts));
            }
        }

        scanner.close();
        try {
            throw new TooManyAttemptsException("Too many failed login attempts. Access denied.");
        } catch (TooManyAttemptsException e) {
            System.out.println(e.getMessage());
        }
    }
}
