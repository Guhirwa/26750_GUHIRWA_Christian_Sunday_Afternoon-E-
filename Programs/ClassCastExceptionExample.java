package Programs;
/*
 * Exception: ClassCastException
 * Description: Demonstrates an invalid type cast.
 * Approach: Attempts to cast a String object to an Integer type.
 */

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting an invalid cast
            Object obj = "String";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            // Catches and handles the exception
            System.out.println("ClassCastException caught: Invalid type cast. " + e.getMessage());
        }
    }
}
