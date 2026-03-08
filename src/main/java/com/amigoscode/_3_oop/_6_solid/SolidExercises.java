package com.amigoscode._3_oop._6_solid;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise: SOLID Principles
 *
 * Practice all five SOLID principles by refactoring problematic code
 * into clean, well-structured designs.
 *
 * S - Single Responsibility Principle (SRP)
 * O - Open/Closed Principle (OCP)
 * L - Liskov Substitution Principle (LSP)
 * I - Interface Segregation Principle (ISP)
 * D - Dependency Inversion Principle (DIP)
 */
public class SolidExercises {

    // =========================================================================
    // SRP - Single Responsibility Principle
    // "A class should have only one reason to change."
    //
    // PROBLEM: UserManager below does THREE things — validation, persistence,
    // and notification. If any one of these changes, the whole class changes.
    // =========================================================================

    // This is the BROKEN version. Do not modify it — write the fix below.
    static class UserManagerBroken {
        void createUser(String name, String email) {
            // Validates
            if (name == null || name.isEmpty()) throw new IllegalArgumentException("Invalid name");
            if (!email.contains("@")) throw new IllegalArgumentException("Invalid email");
            // Saves to database
            System.out.println("Saving user " + name + " to database...");
            // Sends welcome email
            System.out.println("Sending welcome email to " + email + "...");
        }
    }

    // TODO: 1 - Refactor by creating three separate classes:
    //   - UserValidator with a method: void validate(String name, String email)
    //     that throws IllegalArgumentException for invalid input
    //   - UserRepository with a method: void save(String name, String email)
    //     that prints "Saving user <name> to database..."
    //   - UserNotifier with a method: void sendWelcome(String email)
    //     that prints "Sending welcome email to <email>..."
    //   Then create a refactored UserManager that uses all three via
    //   constructor injection and has a createUser(name, email) method.
    static class UserValidator {
        void validate(String name, String email) {
            if (name == null || name.isEmpty()) throw new IllegalArgumentException("Invalid name");
            if (!email.contains("@")) throw new IllegalArgumentException("Invalid email");
        }
    }

    static class UserRepository {
        void save(String name, String email) {
            System.out.println("Saving user " + name + " to database...");
        }
    }

    static class UserNotifier {
        void sendWelcome(String email) {
            System.out.println("Sending welcome email to " + email + "...");
        }
    }

    static class UserManager {
        private final UserValidator validator;
        private final UserRepository repository;
        private final UserNotifier notifier;

        UserManager(UserValidator validator, UserRepository repository, UserNotifier notifier) {
            this.validator = validator;
            this.repository = repository;
            this.notifier = notifier;
        }

        void createUser(String name, String email) {
            validator.validate(name, email);
            repository.save(name, email);
            notifier.sendWelcome(email);
        }
    }

    // =========================================================================
    // OCP - Open/Closed Principle
    // "Open for extension, closed for modification."
    //
    // PROBLEM: Adding a new discount type requires modifying the existing
    // calculateDiscount method with another if/else branch.
    // =========================================================================

    // This is the BROKEN version. Do not modify it.
    static class DiscountCalculatorBroken {
        double calculateDiscount(String type, double price) {
            if ("SEASONAL".equals(type)) return price * 0.10;
            if ("CLEARANCE".equals(type)) return price * 0.50;
            // To add a new type, you must modify THIS method — violates OCP!
            return 0;
        }
    }

    // TODO: 2 - Refactor using an interface:
    //   - Create a Discount interface with: double apply(double price)
    //   - Create SeasonalDiscount implementing Discount (10% off)
    //   - Create ClearanceDiscount implementing Discount (50% off)
    //   - Create a DiscountCalculator class with a method:
    //     double calculate(Discount discount, double price)
    //     that just calls discount.apply(price)
    //   Now new discount types can be added without modifying DiscountCalculator.
    interface Discount {
        double apply(double price);
    }

    static class SeasonalDiscount implements Discount {
        @Override
        public double apply(double price) {
            return price * 0.10;
        }
    }

    static class ClearanceDiscount implements Discount {
        @Override
        public double apply(double price) {
            return price * 0.50;
        }
    }

    static class DiscountCalculator {
        double calculate(Discount discount, double price) {
            return discount.apply(price);
        }
    }

    // =========================================================================
    // LSP - Liskov Substitution Principle
    // "Subtypes must be substitutable for their base types."
    //
    // PROBLEM: MutableSquare extends MutableRectangle but breaks the contract.
    // Setting width on a square also changes height, which surprises code
    // that expects normal rectangle behavior.
    // =========================================================================

    // This is the BROKEN version. Do not modify it.
    static class MutableRectangleBroken {
        protected int width;
        protected int height;
        void setWidth(int w) { this.width = w; }
        void setHeight(int h) { this.height = h; }
        int area() { return width * height; }
    }

    static class MutableSquareBroken extends MutableRectangleBroken {
        @Override void setWidth(int w) { this.width = w; this.height = w; }
        @Override void setHeight(int h) { this.width = h; this.height = h; }
        // BUG: rect.setWidth(5); rect.setHeight(3); rect.area() -> 9, not 15!
    }

    // TODO: 3 - Fix the LSP violation. Create IMMUTABLE versions:
    //   - Create a LspShape interface with: int area()
    //   - Create an ImmutableRectangle class implementing LspShape with
    //     final fields width and height, constructor, and area() returning width * height
    //   - Create an ImmutableSquare class implementing LspShape with
    //     a final field side, constructor, and area() returning side * side
    //   Now neither class pretends to be the other. Both satisfy LspShape.
    interface LspShape {
        int area();
    }

    static class ImmutableRectangle implements LspShape {
        private final int width;
        private final int height;

        ImmutableRectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public int area() {
            return width * height;
        }
    }

    static class ImmutableSquare implements LspShape {
        private final int side;

        ImmutableSquare(int side) {
            this.side = side;
        }

        @Override
        public int area() {
            return side * side;
        }
    }

    // =========================================================================
    // ISP - Interface Segregation Principle
    // "No client should be forced to depend on methods it does not use."
    //
    // PROBLEM: Robot is forced to implement eat() and sleep() even though
    // robots don't eat or sleep.
    // =========================================================================

    // This is the BROKEN version. Do not modify it.
    interface WorkerBroken {
        void work();
        void eat();
        void sleep();
    }

    static class HumanWorkerBroken implements WorkerBroken {
        public void work()  { System.out.println("Human working"); }
        public void eat()   { System.out.println("Human eating"); }
        public void sleep() { System.out.println("Human sleeping"); }
    }

    static class RobotWorkerBroken implements WorkerBroken {
        public void work()  { System.out.println("Robot working"); }
        public void eat()   { /* Robots don't eat — forced to implement! */ }
        public void sleep() { /* Robots don't sleep — forced to implement! */ }
    }

    // TODO: 4 - Fix the ISP violation by splitting into smaller interfaces:
    //   - Workable interface with: void work()
    //   - Eatable interface with: void eat()
    //   - Sleepable interface with: void sleep()
    //   - HumanWorker class implementing Workable, Eatable, Sleepable
    //   - RobotWorker class implementing only Workable
    //   Now RobotWorker is not forced to implement methods it cannot use.
    interface Workable {
        void work();
    }

    interface Eatable {
        void eat();
    }

    interface Sleepable {
        void sleep();
    }

    static class HumanWorker implements Workable, Eatable, Sleepable {
        public void work() { System.out.println("Human working"); }
        public void eat() { System.out.println("Human eating"); }
        public void sleep() { System.out.println("Human sleeping"); }
    }

    static class RobotWorker implements Workable {
        public void work() { System.out.println("Robot working"); }
    }

    // =========================================================================
    // DIP - Dependency Inversion Principle
    // "Depend on abstractions, not on concretions."
    //
    // PROBLEM: ReportGenerator directly creates MySQLDatabase inside itself.
    // It is tightly coupled to MySQL and cannot work with any other database.
    // =========================================================================

    // This is the BROKEN version. Do not modify it.
    static class MySQLDatabaseBroken {
        String query(String sql) {
            return "MySQL result for: " + sql;
        }
    }

    static class ReportGeneratorBroken {
        private MySQLDatabaseBroken database = new MySQLDatabaseBroken(); // tight coupling!
        String generateReport() {
            return database.query("SELECT * FROM reports");
        }
    }

    // TODO: 5 - Fix the DIP violation:
    //   - Create a Database interface with: String query(String sql)
    //   - Create MySQLDatabase implementing Database
    //   - Create PostgreSQLDatabase implementing Database
    //     (its query() returns "PostgreSQL result for: " + sql)
    //   - Create ReportGenerator that takes Database in its constructor
    //     (constructor injection) and uses it in generateReport()
    interface Database {
        String query(String sql);
    }

    static class MySQLDatabase implements Database {
        @Override
        public String query(String sql) {
            return "MySQL result for: " + sql;
        }
    }

    static class PostgreSQLDatabase implements Database {
        @Override
        public String query(String sql) {
            return "PostgreSQL result for: " + sql;
        }
    }

    static class ReportGenerator {
        private final Database database;

        ReportGenerator(Database database) {
            this.database = database;
        }

        String generateReport() {
            return database.query("SELECT * FROM reports");
        }
    }

    // =========================================================================
    // Main method to test all exercises
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("=== SOLID Exercises ===\n");

        // TODO: 6 - Test SRP: Create UserValidator, UserRepository, UserNotifier,
        //   and a refactored UserManager. Call createUser("Alice", "alice@test.com").
        UserManager userManager = new UserManager(new UserValidator(), new UserRepository(), new UserNotifier());
        userManager.createUser("Alice", "alice@test.com");

        // TODO: 7 - Test OCP: Create a DiscountCalculator and several Discount
        //   implementations. Calculate discounts for a $100 item and print results.
        DiscountCalculator discountCalc = new DiscountCalculator();
        System.out.println("Seasonal discount on $100: $" + discountCalc.calculate(new SeasonalDiscount(), 100.0));
        System.out.println("Clearance discount on $100: $" + discountCalc.calculate(new ClearanceDiscount(), 100.0));

        // TODO: 8 - Test DIP: Create a ReportGenerator with MySQLDatabase,
        //   generate a report. Then create another with PostgreSQLDatabase
        //   and generate a report. Print both results to show the
        //   implementation was swapped without changing ReportGenerator.
        ReportGenerator mysqlReport = new ReportGenerator(new MySQLDatabase());
        System.out.println(mysqlReport.generateReport());

        ReportGenerator pgReport = new ReportGenerator(new PostgreSQLDatabase());
        System.out.println(pgReport.generateReport());

    }
}
