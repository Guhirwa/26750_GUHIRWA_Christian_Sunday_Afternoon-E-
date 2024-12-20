package Programs;
/*
 * Exception: IOException
 * Description: Simulates an input/output error by attempting to read a non-existent file.
 * Approach: We use a try-catch block to handle the IOException. The FileReader attempts
 *           to open a non-existent file, which throws the exception.
 */

import java.io.*;

public class IOException {
    public static void main(String[] args) {
        // Attempt to open and read from a non-existent file
        try {
            // FileReader is used to read character files
            BufferedReader reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
            System.out.println(reader.readLine()); // Tries to read the first line
        } catch (java.io.IOException e) {
            // Catches the exception and prints an error message
            System.out.println("IOException caught: Unable to read the file. " + e.getMessage());
        }
    }
}
