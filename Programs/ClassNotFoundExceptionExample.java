package Programs;
/*
 * Exception: ClassNotFoundException
 * Description: Demonstrates a scenario where a missing class file is attempted to be loaded.
 * Approach: Uses Class.forName to attempt loading a non-existent class.
 */

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempts to load a missing class
            Class.forName("com.nonexistent.Driver");
        } catch (ClassNotFoundException e) {
            // Catches and handles the exception
            System.out.println("ClassNotFoundException caught: Class not found. " + e.getMessage());
        }
    }
}
