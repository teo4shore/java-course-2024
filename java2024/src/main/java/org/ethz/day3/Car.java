package org.ethz.day3;

public class Car extends Vehicle {
    private int capacity;          // Passenger capacity
    private double length;         // Length of the car
    private String manufacturer;   // Manufacturer of the car

    // Constructor
    public Car(String id, int capacity, double length, String manufacturer) {
        super(id);  // Call the constructor of the Vehicle class
        this.capacity = capacity;
        this.length = length;
        this.manufacturer = manufacturer;
    }

    // Getter for capacity
    public int getCapacity() {
        return capacity;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Getter for manufacturer
    public String getManufacturer() {
        return manufacturer;
    }
}

