//Password Validator
import java.util.Scanner;

public class Q6Password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Not a Valid Password");
        }

        scanner.close();
    }

        public static boolean isValidPassword(String password) {
        int length = password.length();

        // Check for minimum and maximum length
        if (length < 6 || length > 16) {
            return false;
        }

        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (c == '$' || c == '#' || c == '@') {
                hasSpecialChar = true;
            }
        }
        return hasLowerCase && hasUpperCase && hasDigit && hasSpecialChar;
    }
}
