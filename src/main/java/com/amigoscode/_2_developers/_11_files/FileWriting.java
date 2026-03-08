package com.amigoscode._2_developers._11_files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * File Writing Exercises
 *
 * Practice writing to files using the modern java.nio.file API and the
 * classic java.io API. Learn to write, append, and copy files.
 */
public class FileWriting {

    /**
     * Writes a string to a file, creating the file if it doesn't exist
     * or overwriting it if it does.
     *
     * @param filePath the path to the file
     * @param content  the content to write
     * @throws IOException if writing fails
     */
    public static void writeString(String filePath, String content) throws IOException {
        // TODO: 1 - Use Files.writeString(Path.of(filePath), content) to write the content.
        //  This creates the file if it doesn't exist, or overwrites it if it does.

    }

    /**
     * Appends text to an existing file. Adds a newline before the text.
     *
     * @param filePath the path to the file
     * @param text     the text to append
     * @throws IOException if writing fails
     */
    public static void appendToFile(String filePath, String text) throws IOException {
        // TODO: 2 - Use Files.writeString with StandardOpenOption.APPEND to append text.
        //  Add a newline ("\n") before the text so it appears on a new line.
        //  Example: Files.writeString(Path.of(filePath), "\n" + text, StandardOpenOption.APPEND);

    }

    /**
     * Writes a list of strings to a file, one per line.
     *
     * @param filePath the path to the file
     * @param lines    the list of strings to write
     * @throws IOException if writing fails
     */
    public static void writeLines(String filePath, List<String> lines) throws IOException {
        // TODO: 3 - Use Files.write(Path.of(filePath), lines) to write all lines.
        //  Each string in the list becomes one line in the file.

    }

    /**
     * Writes to a file using BufferedWriter in a try-with-resources block.
     * Writes three lines of text.
     *
     * @param filePath the path to the file
     * @throws IOException if writing fails
     */
    public static void writeWithBufferedWriter(String filePath) throws IOException {
        // TODO: 4 - Use try-with-resources to create a BufferedWriter:
        //  try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        //      writer.write("Line 1");
        //      writer.newLine();
        //      writer.write("Line 2");
        //      writer.newLine();
        //      writer.write("Line 3");
        //  }

    }

    /**
     * Copies the contents of one file to another.
     *
     * @param sourcePath      the source file path
     * @param destinationPath the destination file path
     * @throws IOException if reading or writing fails
     */
    public static void copyFile(String sourcePath, String destinationPath) throws IOException {
        // TODO: 5 - Read the content from sourcePath and write it to destinationPath.
        //  You can use Files.readString() + Files.writeString(),
        //  or Files.copy(Path.of(sourcePath), Path.of(destinationPath)) for a direct copy.
        //  Note: Files.copy will throw if destination already exists unless you add
        //  StandardCopyOption.REPLACE_EXISTING.

    }

    /**
     * Writes formatted CSV data to a file.
     *
     * @param filePath the path to the file
     * @param headers  the column headers
     * @param rows     the data rows (each row is an array of values)
     * @throws IOException if writing fails
     */
    public static void writeCsv(String filePath, String[] headers, String[][] rows) throws IOException {
        // TODO: 6 - Write a CSV file:
        //  First, write the headers joined by commas, followed by a newline.
        //  Then, for each row, write the values joined by commas, followed by a newline.
        //  Use StringBuilder or String.join(",", array) to build each line.
        //  Write the complete result using Files.writeString().

    }

    public static void main(String[] args) throws IOException {
        String baseDir = "test-output";
        Files.createDirectories(Path.of(baseDir));

        System.out.println("=== Write String ===");
        writeString(baseDir + "/write-test.txt", "Hello, File!");
        System.out.println("Written. Content: " + Files.readString(Path.of(baseDir + "/write-test.txt")));

        System.out.println("\n=== Append to File ===");
        appendToFile(baseDir + "/write-test.txt", "This was appended!");
        System.out.println("Appended. Content:\n" + Files.readString(Path.of(baseDir + "/write-test.txt")));

        System.out.println("\n=== Write Lines ===");
        writeLines(baseDir + "/lines-test.txt", List.of("Apple", "Banana", "Cherry"));
        System.out.println("Lines written:");
        Files.readAllLines(Path.of(baseDir + "/lines-test.txt")).forEach(System.out::println);

        System.out.println("\n=== BufferedWriter ===");
        writeWithBufferedWriter(baseDir + "/buffered-test.txt");
        System.out.println("BufferedWriter output:");
        Files.readAllLines(Path.of(baseDir + "/buffered-test.txt")).forEach(System.out::println);

        System.out.println("\n=== Copy File ===");
        copyFile(baseDir + "/write-test.txt", baseDir + "/copy-test.txt");
        System.out.println("Copied. Content:\n" + Files.readString(Path.of(baseDir + "/copy-test.txt")));

        System.out.println("\n=== Write CSV ===");
        String[] headers = {"Name", "Age", "City"};
        String[][] rows = {
                {"Alice", "30", "London"},
                {"Bob", "25", "Paris"},
                {"Charlie", "35", "Tokyo"}
        };
        writeCsv(baseDir + "/data.csv", headers, rows);
        System.out.println("CSV written:");
        System.out.println(Files.readString(Path.of(baseDir + "/data.csv")));

        // Clean up
        Files.walk(Path.of(baseDir))
                .sorted(java.util.Comparator.reverseOrder())
                .forEach(p -> { try { Files.delete(p); } catch (IOException ignored) {} });
    }
}
