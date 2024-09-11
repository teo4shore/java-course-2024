package org.ethz.day3;

public class TestLinkWithVehicles {
    public static void main(String[] args) {
        // Step 1: Create nodes and links
        Node node1 = new Node(0.0, 0.0, "Node1");
        Node node2 = new Node(10.0, 0.0, "Node2");
        String[] modes = {"car", "bus"};
        Link link = new Link(node1, node2, "Link1", modes, 10.0, 60, 1000.0);

        // Step 2: Create the LinkWithVehicles object
        LinkWithVehicles linkWithVehicles = new LinkWithVehicles(link);

        // Step 3: Create some Cars and Buses
        Car car1 = new Car("Car1", 5, 4.5, "Toyota");
        Car car2 = new Car("Car2", 4, 4.0, "Honda");
        Bus bus1 = new Bus("Bus1", 20, 30, 12.0, "CityTransport");
        Bus bus2 = new Bus("Bus2", 15, 25, 11.5, "MetroBus");

        // Step 4: Add vehicles to the link
        linkWithVehicles.addVehicle(car1);
        linkWithVehicles.addVehicle(car2);
        linkWithVehicles.addVehicle(bus1);
        linkWithVehicles.addVehicle(bus2);

        // Step 5: Display vehicle information
        linkWithVehicles.displayVehicleInfo();

        // Step 6: Remove a vehicle and display updated information
        linkWithVehicles.removeVehicle(car1);
        System.out.println("\nAfter removing Car1:");
        linkWithVehicles.displayVehicleInfo();
    }
}
