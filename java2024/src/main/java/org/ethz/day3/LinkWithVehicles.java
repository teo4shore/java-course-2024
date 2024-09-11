package org.ethz.day3;

import java.util.ArrayList;

public class LinkWithVehicles {
    private Link link;  // The link from Exercise 3
    private ArrayList<Vehicle> vehicles;  // List of vehicles on the link
    private static final int MAX_VEHICLES = 100;  // Maximum number of vehicles on the link

    // Constructor
    public LinkWithVehicles(Link link) {
        this.link = link;
        this.vehicles = new ArrayList<>();
    }

    // Method to add a vehicle to the link
    public boolean addVehicle(Vehicle vehicle) {
        if (vehicles.size() < MAX_VEHICLES) {
            vehicles.add(vehicle);
            return true;
        } else {
            System.out.println("Cannot add vehicle. Link is full.");
            return false;
        }
    }

    // Method to remove a vehicle from the link
    public boolean removeVehicle(Vehicle vehicle) {
        return vehicles.remove(vehicle);
    }

    // Method to output the capacity and length of all vehicles on the link
    public void displayVehicleInfo() {
        System.out.println("Vehicle Information on the Link:");
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("Car ID: " + car.getId() + ", Capacity: " + car.getCapacity() + ", Length: " + car.getLength() + " meters, Manufacturer: " + car.getManufacturer());
            } else if (vehicle instanceof Bus) {
                Bus bus = (Bus) vehicle;
                System.out.println("Bus ID: " + bus.getId() + ", Sitting Capacity: " + bus.getSittingCapacity() + ", Standing Capacity: " + bus.getStandingCapacity() + ", Length: " + bus.getLength() + " meters, Company: " + bus.getCompany());
            }
        }
    }
}
