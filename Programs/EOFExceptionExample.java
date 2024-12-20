package Programs;

/*
 * Exception: EOFException
 * Description: Simulates an attempt to read beyond the end of a file.
 * Approach: ObjectInputStream reads from a file, and we attempt to read continuously
 *           until an EOFException occurs.
 */

import java.io.*;

public class EOFExceptionExample {
    public static void main(String[] args) {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("example.dat"))) {
            // Loop to read objects until the end of the file is reached
            while (true) {
                System.out.println(input.readObject()); // Reads an object from the file
            }
        } catch (EOFException e) {
            // Catches the exception and handles it when EOF is reached
            System.out.println("EOFException caught: Reached the end of the file unexpectedly.");
        } catch (java.io.IOException | ClassNotFoundException e) {
            // Handles other potential exceptions
            System.out.println("Error caught: " + e.getMessage());

        }
    }
}

