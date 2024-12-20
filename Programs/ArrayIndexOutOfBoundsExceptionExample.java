package Programs;
/*
 * Exception: ArrayIndexOutOfBoundsException
 * Description: Demonstrates accessing an invalid index in an array.
 * Approach: Accessing an index outside the array bounds triggers the exception.
 */

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            // Accessing an invalid array index
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Index 5 does not exist
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catches and handles the exception
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid array index. " + e.getMessage());
        }
    }
}
