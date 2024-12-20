package Programs;
/*
 * Exception: IllegalArgumentException
 * Description: Demonstrates passing an invalid argument to a method.
 * Approach: Passes an invalid thread priority value.
 */

public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            // Passing an invalid argument
            Thread thread = new Thread();
            thread.setPriority(11); // Invalid priority
        } catch (IllegalArgumentException e) {
            // Catches and handles the exception
            System.out.println("IllegalArgumentException caught: Invalid argument. " + e.getMessage());
        }
    }
}
