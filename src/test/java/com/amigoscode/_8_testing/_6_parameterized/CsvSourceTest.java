package com.amigoscode._8_testing._6_parameterized;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Exercise: CSV-Based Parameterized Tests
 *
 * Practice using @CsvSource, @CsvFileSource, custom display names,
 * and custom ArgumentsProvider for data-driven tests.
 */
@DisplayName("CSV Source Parameterized Tests")
class CsvSourceTest {

    // TODO: 1 - Test math operations with @CsvSource.
    //  Use @ParameterizedTest and @CsvSource to test addition:
    //  @CsvSource({"1, 1, 2", "2, 3, 5", "10, -5, 5", "0, 0, 0", "-3, -7, -10"})
    //  The test method takes (int a, int b, int expectedSum) parameters.
    //  Assert that a + b equals expectedSum.


    // TODO: 2 - Test string operations with @CsvSource.
    //  Use @CsvSource to test String.toUpperCase():
    //  @CsvSource({"hello, HELLO", "world, WORLD", "java, JAVA", "'', ''"})
    //  The test method takes (String input, String expected) parameters.
    //  Assert that input.toUpperCase() equals expected.
    //  Note: Use single quotes for empty strings in CSV.


    // TODO: 3 - Use @CsvFileSource to load test data from a CSV file.
    //  Create a file at src/test/resources/email-test-data.csv with content:
    //    email,expected
    //    user@example.com,true
    //    invalid-email,false
    //    test@domain.org,true
    //    @missing.com,false
    //  Annotate with @CsvFileSource(resources = "/email-test-data.csv",
    //      numLinesToSkip = 1) to skip the header row.
    //  The test method takes (String email, boolean expected) parameters.
    //  Use a new EmailValidator() to test isValid(email) equals expected.


    // TODO: 4 - Use custom display names with @ParameterizedTest(name = ...).
    //  Annotate with @ParameterizedTest(name = "{0} * {1} = {2}")
    //  and @CsvSource({"2, 3, 6", "4, 5, 20", "0, 100, 0", "-2, 3, -6"}).
    //  The test method takes (int a, int b, int expectedProduct) parameters.
    //  Assert that a * b equals expectedProduct.


    // TODO: 5 - Use @ArgumentsSource with a custom ArgumentsProvider.
    //  Create a static inner class named CustomArgumentsProvider that
    //  implements ArgumentsProvider.
    //  Override provideArguments to return a Stream of Arguments.
    //  Provide at least 3 sets of (String input, int expectedLength) pairs.
    //  Write a test annotated with @ArgumentsSource(CustomArgumentsProvider.class).
    //  Assert that input.length() equals expectedLength.
    //  Hint:
    //  static class CustomArgumentsProvider implements ArgumentsProvider {
    //      @Override
    //      public Stream<? extends Arguments> provideArguments(ExtensionContext ctx) {
    //          return Stream.of(
    //              Arguments.of("hello", 5),
    //              Arguments.of("", 0),
    //              Arguments.of("Java", 4)
    //          );
    //      }
    //  }

}
