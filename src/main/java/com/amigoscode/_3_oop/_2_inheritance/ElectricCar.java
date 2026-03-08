package com.amigoscode._3_oop._2_inheritance;

/**
 * Exercise: Inheritance - ElectricCar Subclass
 *
 * Create an ElectricCar that extends Vehicle. Practice constructor
 * chaining with super(), overriding methods, and adding behavior
 * unique to electric vehicles.
 *
 * Key concepts:
 * - Extending a parent class and calling super()
 * - Overriding methods to change behavior
 * - Adding subclass-specific fields and methods
 */

// TODO: 1 - Make this class extend Vehicle.
public class ElectricCar extends Vehicle {

    // TODO: 2 - Add a private field:
    //   - batteryLevel (int) representing percentage from 0 to 100
    private int batteryLevel;

    // TODO: 3 - Create a constructor that takes make, model, year, and batteryLevel.
    //   Call super(make, model, year) first, then set the batteryLevel field.
    public ElectricCar(String make, String model, int year, int batteryLevel) {
        super(make, model, year);
        this.batteryLevel = batteryLevel;
    }

    // TODO: 4 - Override the start() method to print:
    //   "<make> <model> electric motor starting silently..."
    //   Use the @Override annotation. Access make and model from
    //   the parent class (they are protected).
    @Override
    public void start() {
        System.out.println(make + " " + model + " electric motor starting silently...");
    }

    // TODO: 5 - Add a charge(int percent) method specific to ElectricCar.
    //   - Add percent to batteryLevel
    //   - Cap batteryLevel at 100 (use Math.min)
    //   - Print: "Charging... Battery now at <batteryLevel>%"
    public void charge(int percent) {
        batteryLevel = Math.min(batteryLevel + percent, 100);
        System.out.println("Charging... Battery now at " + batteryLevel + "%");
    }

    // TODO: 6 - Add a getBatteryStatus() method that returns a String:
    //   "Battery: <batteryLevel>%"
    //   Also override toString() to return:
    //   "ElectricCar{make='XXX', model='XXX', year=XXX, batteryLevel=XXX%}"
    public String getBatteryStatus() {
        return "Battery: " + batteryLevel + "%";
    }

    @Override
    public String toString() {
        return "ElectricCar{make='" + make + "', model='" + model + "', year=" + year + ", batteryLevel=" + batteryLevel + "%}";
    }


    public static void main(String[] args) {
        // Uncomment and test after completing the TODOs:
        // ElectricCar tesla = new ElectricCar("Tesla", "Model 3", 2024, 85);
        // System.out.println(tesla);
        // tesla.start();                      // overridden — silent start
        // System.out.println(tesla.getInfo()); // inherited from Vehicle
        // System.out.println(tesla.getBatteryStatus());
        //
        // tesla.charge(20);
        // System.out.println(tesla.getBatteryStatus());
        //
        // // Polymorphism: an ElectricCar IS-A Vehicle
        // Vehicle vehicle = new ElectricCar("Rivian", "R1T", 2025, 60);
        // vehicle.start(); // calls ElectricCar's overridden version
    }
}
