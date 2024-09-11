package org.ethz.day3;

public class Bus extends Vehicle {
    private int standingCapacity;  // Standing capacity
    private int sittingCapacity;   // Sitting capacity
    private double length;         // Length of the bus
    private String company;        // Company owning the bus

    // Constructor
    public Bus(String id, int standingCapacity, int sittingCapacity, double length, String company) {
        super(id);  // Call the constructor of the Vehicle class
        this.standingCapacity = standingCapacity;
        this.sittingCapacity = sittingCapacity;
        this.length = length;
        this.company = company;
    }

    // Getter for standing capacity
    public int getStandingCapacity() {
        return standingCapacity;
    }

    // Getter for sitting capacity
    public int getSittingCapacity() {
        return sittingCapacity;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Getter for company
    public String getCompany() {
        return company;
    }
}

