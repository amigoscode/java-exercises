package com.amigoscode._1_beginners._1_thebasics;

/**
 * Exercise: Conditional Statements
 *
 * Learn how to control the flow of your program using if/else and switch statements.
 * Conditional statements allow your program to make decisions based on conditions.
 */
public class ConditionalStatements {

    public static void main(String[] args) {

        // TODO: 1 - Write an if statement that prints "Positive" if a number is greater than 0
        // Declare an int variable called number and assign it a positive value.
        System.out.println("TODO 1");
        int number = 7;
        if (number > 0) {
            System.out.println("Positive");
        }

        // TODO: 2 - Add an else clause to the above that prints "Not positive"
        // Change the value of number to a negative value or 0 to test both branches.
        System.out.println("TODO 2");
        if (number > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Not positive");
        }


        // TODO: 3 - Write an if/else if/else chain for grade classification
        // Declare an int variable called score and assign it a value (0-100).
        // If score >= 90, print "Grade: A"
        // Else if score >= 80, print "Grade: B"
        // Else if score >= 70, print "Grade: C"
        // Else print "Grade: F"
        System.out.println("TODO 3");
        int score = 71;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }


        // TODO: 4 - Write a switch statement for day of the week
        // Declare an int variable called day (1-7).
        // Use a switch statement to print the day name:
        //   1 -> "Monday", 2 -> "Tuesday", ... 7 -> "Sunday"
        // Include a default case for invalid values.
        System.out.println("TODO 4");
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid value");
                break;
        }


        // TODO: 5 - Use a switch statement with a String
        // Declare a String variable called month (e.g., "February").
        // Use a switch statement to print the number of days in that month.
        // Handle at least 3-4 months plus a default case.
        System.out.println("TODO 5");
        String month = "July";
        switch (month) {
            case "February":
                System.out.println("Number of days: " + 28);
                break;
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("Number of days: " + 31);
                break;
            default:
                System.out.println("Number of days: " + 30);
                break;
        }


        // TODO: 6 - Use a switch expression (Java 14+) to return a value
        // Using the 'day' variable from above, assign the day name to a String
        // using a switch expression with arrow syntax:
        //   String dayName = switch (day) {
        //       case 1 -> "Monday";
        //       ...
        //   };
        // Print the result.
        System.out.println("TODO 6");
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

        System.out.println(dayName);


        // TODO: 7 - Write a nested if statement to check if a number is positive AND even
        // Declare an int variable called value.
        // First check if it is positive (> 0).
        //   If positive, check if it is even (value % 2 == 0).
        //     If even, print "Positive and even"
        //     Else print "Positive and odd"
        //   Else print "Not positive"
        System.out.println("TODO 7");
        int value = 2;
        if (value > 0) {
            if (value % 2 == 0) {
                System.out.println("Positive and even");
            } else {
                System.out.println("Positive and odd");
            }
        } else {
            System.out.println("Not positive");
        }

    }
}
