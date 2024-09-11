package org.ethz.day3;

public class Node {
    // Data fields
    private double x;  // x-coordinate
    private double y;  // y-coordinate
    private String id; // ID of the node
    
    // Constructor to initialize the fields
    public Node(double x, double y, String id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }
    
    // Getter methods
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public String getId() {
        return id;
    }
}
