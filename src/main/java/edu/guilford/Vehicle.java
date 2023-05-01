package edu.guilford;

/**
 * Hello world!
 *
 */
import java.util.Arrays;

abstract class Vehicle implements Comparable<Vehicle> {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public abstract String get_description();

    public void start_engine() {
        System.out.println("Starting the engine of the vehicle.");
    }

    public int compareTo(Vehicle other) {
        return this.get_num_wheels() - other.get_num_wheels();
    }

    protected abstract int get_num_wheels();
}

class Car extends Vehicle {
    private int num_doors;

    public Car(String make, String model, int year, int num_doors) {
        super(make, model, year);
        this.num_doors = num_doors;
    }

    public String get_description() {
        return String.format("A %d %s %s with %d doors", this.year, this.make, this.model, this.num_doors);
    }

    protected int get_num_wheels() {
        return 4;
    }

    public void start_engine() {
        System.out.println("Starting the engine of the car.");
    }
}

class Truck extends Vehicle {
    private int payload_capacity;

    public Truck(String make, String model, int year, int payload_capacity) {
        super(make, model, year);
        this.payload_capacity = payload_capacity;
    }

    public String get_description() {
        return String.format("A %d %s %s with a payload capacity of %d pounds", this.year, this.make, this.model, this.payload_capacity);
    }

    protected int get_num_wheels() {
        return 4;
    }

    public void start_engine() {
        System.out.println("Starting the engine of the truck.");
    }
}

class Motorcycle extends Vehicle {
    private int num_wheels;

    public Motorcycle(String make, String model, int year, int num_wheels) {
        super(make, model, year);
        this.num_wheels = num_wheels;
    }

    public String get_description() {
        return String.format("A %d %s %s with %d wheels", this.year, this.make, this.model, this.num_wheels);
    }

    public void start_engine() {
        System.out.println("Starting the engine of the motorcycle.");
    }

    public void wheelie() {
        System.out.println("The motorcycle is doing a wheelie!");
    }

    protected int get_num_wheels() {
        return this.num_wheels;
    }
}