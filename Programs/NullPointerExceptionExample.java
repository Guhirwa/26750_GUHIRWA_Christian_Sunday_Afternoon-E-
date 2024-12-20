package Programs;
/*
 * Exception: NullPointerException
 * Description: Demonstrates accessing a null reference.
 * Approach: A null string is accessed, triggering the exception.
 */

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            // Accessing a null reference
            String str = null;
            System.out.println(str.length()); // Attempts to get the length of a null string
        } catch (NullPointerException e) {
            // Catches and handles the exception
            System.out.println("NullPointerException caught: Null reference accessed. " + e.getMessage());
        }
    }
}


