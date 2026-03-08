package com.amigoscode._8_testing._4_junitfeatures;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Exercise: JUnit 5 Features
 *
 * Practice using JUnit 5 annotations and features:
 * @BeforeEach, @AfterEach, @BeforeAll, @AfterAll,
 * @DisplayName, @Disabled, @Nested, @RepeatedTest, @Tag
 */
@DisplayName("JUnit 5 Features Showcase")
class JunitFeaturesTest {

    // This list will be used across tests to demonstrate lifecycle methods
    private List<String> items;

    // This static counter will be used to demonstrate @BeforeAll/@AfterAll
    private static int testCount;

    // TODO: 1 - Use @BeforeAll to perform one-time setup.
    //  Create a static method named initAll() annotated with @BeforeAll.
    //  Inside, set testCount = 0 and print "Starting all tests...".
    //  Note: @BeforeAll methods must be static.
    @BeforeAll
    static void initAll() {
        testCount = 0;
        System.out.println("Starting all tests...");
    }

    // TODO: 2 - Use @BeforeEach to set up test data before every test.
    //  Create a method named setUp() annotated with @BeforeEach.
    //  Initialize the items list as a new ArrayList<>().
    //  Add "apple" and "banana" to the list. Increment testCount.
    @BeforeEach
    void setUp() {
        items = new ArrayList<>();
        items.add("apple");
        items.add("banana");
        testCount++;
    }

    // TODO: 3 - Use @AfterEach to clean up after every test.
    //  Create a method named tearDown() annotated with @AfterEach.
    //  Clear the items list and print "Test #" + testCount + " completed".
    @AfterEach
    void tearDown() {
        items.clear();
        System.out.println("Test #" + testCount + " completed");
    }

    // TODO: 4 - Write a test with @DisplayName for a readable name.
    //  Annotate with @Test and @DisplayName("Items list should start with 2 elements").
    //  Assert that items.size() equals 2.
    @Test
    @DisplayName("Items list should start with 2 elements")
    void testItemsSize() {
        assertEquals(2, items.size());
    }

    // TODO: 5 - Use @Disabled to skip a test.
    //  Create a test annotated with @Test, @Disabled("Demonstrating disabled test"),
    //  and @DisplayName.
    //  Inside, call fail("This test should not run") so it would fail if it were enabled.
    @Test
    @Disabled("Demonstrating disabled test")
    @DisplayName("This test is disabled")
    void testDisabled() {
        fail("This test should not run");
    }

    // TODO: 6 - Use @Nested to group related tests in an inner class.
    //  Create an inner class named AddingItems annotated with @Nested
    //  and @DisplayName("When adding items").
    //  Inside it, write two tests:
    //    - "Adding an item increases the list size" - add "cherry" and assert size is 3
    //    - "Added item is in the list" - add "date" and assert items.contains("date")
    @Nested
    @DisplayName("When adding items")
    class AddingItems {
        @Test
        @DisplayName("Adding an item increases the list size")
        void testAddingItemIncreasesSize() {
            items.add("cherry");
            assertEquals(3, items.size());
        }

        @Test
        @DisplayName("Added item is in the list")
        void testAddedItemIsInList() {
            items.add("date");
            assertTrue(items.contains("date"));
        }
    }

    // TODO: 7 - Use @RepeatedTest to run the same test 5 times.
    //  Create a method annotated with @RepeatedTest(5) instead of @Test.
    //  Give it @DisplayName("Repeated addition test").
    //  Add a random item to the list and verify size is 3.
    //  Hint: @RepeatedTest(value = 5, name = "Repetition {currentRepetition} of {totalRepetitions}")
    @RepeatedTest(value = 5, name = "Repetition {currentRepetition} of {totalRepetitions}")
    @DisplayName("Repeated addition test")
    void testRepeatedAddition() {
        items.add("item");
        assertEquals(3, items.size());
    }

    // TODO: 8 - Use @Tag to categorize tests.
    //  Create a test annotated with @Test, @Tag("slow"), and @DisplayName.
    //  Inside, assert that items is not null and not empty.
    //  Tags can be used to include/exclude tests at build time.
    @Test
    @Tag("slow")
    @DisplayName("Items should not be null or empty")
    void testItemsNotNullOrEmpty() {
        assertNotNull(items);
        assertFalse(items.isEmpty());
    }

}
