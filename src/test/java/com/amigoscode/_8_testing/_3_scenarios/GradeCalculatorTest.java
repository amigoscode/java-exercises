package com.amigoscode._8_testing._3_scenarios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Exercise: Testing Multiple Scenarios
 *
 * Practice testing a class with many different input/output combinations.
 * Focus on testing normal cases, boundary values, and error conditions.
 */
@DisplayName("Grade Calculator Tests")
class GradeCalculatorTest {

    private GradeCalculator gradeCalculator;

    @BeforeEach
    void setUp() {
        gradeCalculator = new GradeCalculator();
    }

    // TODO: 1 - Test that a score of 95 returns grade "A".
    //  Use assertEquals to verify gradeCalculator.calculateGrade(95) returns "A".
    @Test
    @DisplayName("Score 95 returns A")
    void testGradeA() {
        assertEquals("A", gradeCalculator.calculateGrade(95));
    }

    // TODO: 2 - Test that a score of 85 returns grade "B".
    //  Use assertEquals to verify gradeCalculator.calculateGrade(85) returns "B".
    @Test
    @DisplayName("Score 85 returns B")
    void testGradeB() {
        assertEquals("B", gradeCalculator.calculateGrade(85));
    }

    // TODO: 3 - Test that a score of 75 returns grade "C".
    //  Use assertEquals to verify gradeCalculator.calculateGrade(75) returns "C".
    @Test
    @DisplayName("Score 75 returns C")
    void testGradeC() {
        assertEquals("C", gradeCalculator.calculateGrade(75));
    }

    // TODO: 4 - Test that a score of 65 returns grade "D".
    //  Use assertEquals to verify gradeCalculator.calculateGrade(65) returns "D".
    @Test
    @DisplayName("Score 65 returns D")
    void testGradeD() {
        assertEquals("D", gradeCalculator.calculateGrade(65));
    }

    // TODO: 5 - Test that a score of 50 returns grade "F".
    //  Use assertEquals to verify gradeCalculator.calculateGrade(50) returns "F".
    @Test
    @DisplayName("Score 50 returns F")
    void testGradeF() {
        assertEquals("F", gradeCalculator.calculateGrade(50));
    }

    // TODO: 6 - Test boundary values using assertAll.
    //  Test the exact boundary scores where grades change:
    //  Score 90 -> "A", Score 89 -> "B"
    //  Score 80 -> "B", Score 79 -> "C"
    //  Score 70 -> "C", Score 69 -> "D"
    //  Score 60 -> "D", Score 59 -> "F"
    //  Group all assertions in a single assertAll block.
    @Test
    @DisplayName("Boundary values")
    void testBoundaryValues() {
        assertAll(
            () -> assertEquals("A", gradeCalculator.calculateGrade(90)),
            () -> assertEquals("B", gradeCalculator.calculateGrade(89)),
            () -> assertEquals("B", gradeCalculator.calculateGrade(80)),
            () -> assertEquals("C", gradeCalculator.calculateGrade(79)),
            () -> assertEquals("C", gradeCalculator.calculateGrade(70)),
            () -> assertEquals("D", gradeCalculator.calculateGrade(69)),
            () -> assertEquals("D", gradeCalculator.calculateGrade(60)),
            () -> assertEquals("F", gradeCalculator.calculateGrade(59))
        );
    }

    // TODO: 7 - Test that a negative score throws IllegalArgumentException.
    //  Use assertThrows to verify calculateGrade(-1) throws IllegalArgumentException.
    //  Optionally verify the exception message mentions the negative score.
    @Test
    @DisplayName("Negative score throws IllegalArgumentException")
    void testNegativeScore() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> gradeCalculator.calculateGrade(-1));
        assertTrue(exception.getMessage().contains("-1"));
    }

    // TODO: 8 - Test that a score greater than 100 throws IllegalArgumentException.
    //  Use assertThrows to verify calculateGrade(101) throws IllegalArgumentException.
    //  Also test calculateGrade(150) to be thorough.
    @Test
    @DisplayName("Score greater than 100 throws IllegalArgumentException")
    void testScoreAbove100() {
        assertThrows(IllegalArgumentException.class, () -> gradeCalculator.calculateGrade(101));
        assertThrows(IllegalArgumentException.class, () -> gradeCalculator.calculateGrade(150));
    }

}
