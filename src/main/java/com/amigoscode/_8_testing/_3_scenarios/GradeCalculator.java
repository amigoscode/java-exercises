package com.amigoscode._8_testing._3_scenarios;

/**
 * Grade calculator that converts numeric scores to letter grades and GPA points.
 * This class is fully implemented - focus on writing tests in GradeCalculatorTest.java.
 *
 * Grading scale:
 *   90-100 -> "A"
 *   80-89  -> "B"
 *   70-79  -> "C"
 *   60-69  -> "D"
 *   0-59   -> "F"
 */
public class GradeCalculator {

    /**
     * Converts a numeric score (0-100) to a letter grade.
     * @throws IllegalArgumentException if score is negative or greater than 100
     */
    public String calculateGrade(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("Score cannot be negative: " + score);
        }
        if (score > 100) {
            throw new IllegalArgumentException("Score cannot be greater than 100: " + score);
        }

        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    /**
     * Converts a letter grade to GPA points.
     * A=4.0, B=3.0, C=2.0, D=1.0, F=0.0
     * @throws IllegalArgumentException if grade is not a valid letter grade
     */
    public double getGPA(String grade) {
        if (grade == null) {
            throw new IllegalArgumentException("Grade cannot be null");
        }
        return switch (grade.toUpperCase()) {
            case "A" -> 4.0;
            case "B" -> 3.0;
            case "C" -> 2.0;
            case "D" -> 1.0;
            case "F" -> 0.0;
            default -> throw new IllegalArgumentException("Invalid grade: " + grade);
        };
    }
}
