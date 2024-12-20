package Programs;
/*
 * Exception: ArithmeticException
 * Description: Demonstrates division by zero.
 * Approach: A division operation is performed where the denominator is zero.
 */

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            // Deliberately divide by zero
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Catches and handles the exception
            System.out.println("ArithmeticException caught: Cannot divide by zero. " + e.getMessage());
        }
    }
}
