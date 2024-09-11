package org.ethz.day3;

public class Link {
    // Data fields
    private Node fromNode;           // Starting node
    private Node toNode;             // Ending node
    private String id;               // ID of the link
    private String[] modes;          // Modes allowed on the link
    private double length;           // Length of the link
    private int allowedSpeed;        // Allowed speed on the link
    private double capacity;         // Capacity of the link

    // Constructor to initialize all fields
    public Link(Node fromNode, Node toNode, String id, String[] modes, double length, int allowedSpeed, double capacity) {
        this.fromNode = fromNode;
        this.toNode = toNode;
        this.id = id;
        this.modes = modes;
        this.length = length;
        this.allowedSpeed = allowedSpeed;
        this.capacity = capacity;
    }

    // Getter for fromNode
    public Node getFromNode() {
        return fromNode;
    }

    // Getter for toNode
    public Node getToNode() {
        return toNode;
    }

    // Getter for id
    public String getId() {
        return id;
    }

    // Getter for modes (returns the array of modes)
    public String[] getModes() {
        return modes;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Getter for allowedSpeed
    public int getAllowedSpeed() {
        return allowedSpeed;
    }

    // Getter for capacity
    public double getCapacity() {
        return capacity;
    }
}
