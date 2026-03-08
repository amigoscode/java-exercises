package com.amigoscode._8_testing._2_assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Exercise: JUnit 5 Assertions
 *
 * Practice using different JUnit 5 assertion methods to test the StringUtils class.
 * Each TODO requires a different assertion type.
 */
@DisplayName("StringUtils Tests")
class StringUtilsTest {

    private StringUtils stringUtils;

    @BeforeEach
    void setUp() {
        stringUtils = new StringUtils();
    }

    // TODO: 1 - Test isPalindrome using assertTrue and assertFalse.
    //  Assert that "racecar" is a palindrome (assertTrue).
    //  Assert that "hello" is NOT a palindrome (assertFalse).
    //  Assert that "A man a plan a canal Panama" is a palindrome (assertTrue).


    // TODO: 2 - Test reverse using assertEquals.
    //  Assert that reversing "hello" returns "olleh".
    //  Assert that reversing "Java" returns "avaJ".
    //  Assert that reversing "" (empty string) returns "".


    // TODO: 3 - Test capitalize using assertEquals.
    //  Assert that capitalizing "hello" returns "Hello".
    //  Assert that capitalizing "java" returns "Java".
    //  Assert that capitalizing "" (empty string) returns "".


    // TODO: 4 - Test isEmpty with various inputs including a null check.
    //  Assert that isEmpty(null) returns true (assertTrue).
    //  Assert that isEmpty("") returns true.
    //  Assert that isEmpty("   ") returns true (whitespace only).
    //  Assert that isEmpty("hello") returns false (assertFalse).


    // TODO: 5 - Test countVowels using assertEquals.
    //  Assert that countVowels("hello") returns 2.
    //  Assert that countVowels("AEIOU") returns 5.
    //  Assert that countVowels("xyz") returns 0.


    // TODO: 6 - Use assertAll to group multiple related assertions together.
    //  Group at least 3 assertions about the reverse method into a single assertAll call.
    //  Example: assertAll(
    //      () -> assertEquals("olleh", stringUtils.reverse("hello")),
    //      () -> assertEquals("avaJ", stringUtils.reverse("Java")),
    //      () -> assertEquals("", stringUtils.reverse(""))
    //  );


    // TODO: 7 - Test that passing null input to methods throws IllegalArgumentException.
    //  Use assertThrows to verify that isPalindrome(null) throws IllegalArgumentException.
    //  Use assertThrows to verify that reverse(null) throws IllegalArgumentException.
    //  Use assertThrows to verify that countVowels(null) throws IllegalArgumentException.

}
