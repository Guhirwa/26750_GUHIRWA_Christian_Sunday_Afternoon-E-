package Programs;
/*
 * Exception: NumberFormatException
 * Description: Attempts to convert an invalid string to a number.
 * Approach: Uses Integer.parseInt with an invalid input string.
 */

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            // Parsing an invalid number string
            int number = Integer.parseInt("invalidNumber");
        } catch (NumberFormatException e) {
            // Catches and handles the exception
            System.out.println("NumberFormatException caught: Invalid number format. " + e.getMessage());
        }
    }
}
