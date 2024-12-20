package Programs;
/*
 * Exception: FileNotFoundException
 * Description: Simulates a scenario where a file that doesn't exist is attempted to be opened.
 * Approach: A FileInputStream is used to open a non-existent file, triggering the exception.
 */

import java.io.*;

public class FileNotFoundException {
    public static void main(String[] args) {
        try {
            // FileInputStream opens a file for reading bytes
            FileInputStream file = new FileInputStream("missingfile.txt");
        } catch (java.io.FileNotFoundException e) {
            // Prints an error message when the file is not found
            System.out.println("FileNotFoundException caught: File not found. " + e.getMessage());
        }
    }
}
