package com.amigoscode._2_developers._11_files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * File Reading Exercises
 *
 * Practice reading files using both the modern java.nio.file API and the
 * classic java.io API. Always use try-with-resources for readers and streams
 * to ensure they are properly closed.
 *
 * NOTE: Before running these exercises, create a test file at "test-input.txt"
 * in the project root with several lines of text.
 */
public class FileReading {

    /**
     * Reads all lines from a file and returns them as a List.
     *
     * @param filePath the path to the file
     * @return a list of all lines in the file
     * @throws IOException if the file cannot be read
     */
    public static List<String> readAllLines(String filePath) throws IOException {
        // TODO: 1 - Use Files.readAllLines(Path.of(filePath)) to read all lines.
        //  Return the resulting List<String>.
        return null;
    }

    /**
     * Reads a file using BufferedReader in a try-with-resources block.
     * Prints each line to the console.
     *
     * @param filePath the path to the file
     * @throws IOException if the file cannot be read
     */
    public static void readWithBufferedReader(String filePath) throws IOException {
        // TODO: 2 - Use try-with-resources to create a BufferedReader:
        //  try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        //      read lines in a loop using reader.readLine() until it returns null.
        //      Print each line.
        //  }

    }

    /**
     * Counts the number of lines in a file.
     *
     * @param filePath the path to the file
     * @return the number of lines
     * @throws IOException if the file cannot be read
     */
    public static long countLines(String filePath) throws IOException {
        // TODO: 3 - Read the file line by line and count the lines.
        //  You can use Files.readAllLines() and call .size(),
        //  or use Files.lines() with .count() for a stream-based approach.
        return 0;
    }

    /**
     * Searches for a word in a file and returns all lines containing that word.
     *
     * @param filePath the path to the file
     * @param word     the word to search for
     * @return a list of lines containing the word
     * @throws IOException if the file cannot be read
     */
    public static List<String> searchWord(String filePath, String word) throws IOException {
        // TODO: 4 - Read all lines from the file.
        //  Filter the lines to only include those that contain the given word.
        //  Hint: use a for loop and an ArrayList to collect matching lines,
        //  or use Files.readAllLines().stream().filter(...).toList()
        return null;
    }

    /**
     * Reads the entire file contents into a single String.
     *
     * @param filePath the path to the file
     * @return the file contents as a single String
     * @throws IOException if the file cannot be read
     */
    public static String readFileAsString(String filePath) throws IOException {
        // TODO: 5 - Use Files.readString(Path.of(filePath)) to read the entire file
        //  as a single String. Return it.
        return null;
    }

    /**
     * Attempts to read a file that does not exist. Handles the exception gracefully.
     *
     * @param filePath the path to a non-existent file
     * @return an error message, or file contents if file actually exists
     */
    public static String handleMissingFile(String filePath) {
        // TODO: 6 - Try to read the file using Files.readString().
        //  Catch FileNotFoundException (or NoSuchFileException) and return
        //  "File not found: " + filePath.
        //  Catch IOException and return "Error reading file: " + e.getMessage().
        return null;
    }

    public static void main(String[] args) throws IOException {
        String testFile = "test-input.txt";

        // First, create a test file so the exercises can run
        Files.writeString(Path.of(testFile),
                "Hello World\nJava is great\nPractice makes perfect\nHello again\nJava rocks!");

        System.out.println("=== Read All Lines ===");
        List<String> lines = readAllLines(testFile);
        if (lines != null) lines.forEach(System.out::println);

        System.out.println("\n=== BufferedReader ===");
        readWithBufferedReader(testFile);

        System.out.println("\n=== Count Lines ===");
        System.out.println("Number of lines: " + countLines(testFile));

        System.out.println("\n=== Search Word ===");
        List<String> results = searchWord(testFile, "Java");
        if (results != null) results.forEach(l -> System.out.println("Found: " + l));

        System.out.println("\n=== Read as String ===");
        String content = readFileAsString(testFile);
        if (content != null) System.out.println(content);

        System.out.println("\n=== Handle Missing File ===");
        System.out.println(handleMissingFile("nonexistent.txt"));

        // Clean up test file
        Files.deleteIfExists(Path.of(testFile));
    }
}
