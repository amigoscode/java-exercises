package com.amigoscode._3_oop._2_inheritance;

/**
 * Exercise: Inheritance - Vehicle Base Class
 *
 * Create a Vehicle base class representing any type of vehicle.
 * This will be extended by ElectricCar to demonstrate how
 * inheritance lets you build specialized types on top of
 * general ones.
 *
 * Key concepts:
 * - Defining reusable base class fields and behavior
 * - Methods designed to be overridden by subclasses
 */
public class Vehicle {

    // TODO: 1 - Declare three protected fields:
    //   - make (String)    e.g., "Toyota"
    //   - model (String)   e.g., "Camry"
    //   - year (int)       e.g., 2024
    protected String make;
    protected String model;
    protected int year;

    // TODO: 2 - Create a constructor that takes make, model, and year
    //   and assigns them to the fields.
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // TODO: 3 - Create a start() method that prints:
    //   "<make> <model> engine is starting... Vroom!"
    //   For example: "Toyota Camry engine is starting... Vroom!"
    public void start() {
        System.out.println(make + " " + model + " engine is starting... Vroom!");
    }

    // TODO: 4 - Create a getInfo() method that returns a String:
    //   "<year> <make> <model>"
    //   For example: "2024 Toyota Camry"
    public String getInfo() {
        return year + " " + make + " " + model;
    }

    // TODO: 5 - Override toString() to return:
    //   "Vehicle{make='XXX', model='XXX', year=XXX}"
    @Override
    public String toString() {
        return "Vehicle{make='" + make + "', model='" + model + "', year=" + year + "}";
    }


    public static void main(String[] args) {
        // Uncomment and test after completing the TODOs:
        // Vehicle vehicle = new Vehicle("Toyota", "Camry", 2024);
        // System.out.println(vehicle);
        // vehicle.start();
        // System.out.println(vehicle.getInfo());
    }
}
