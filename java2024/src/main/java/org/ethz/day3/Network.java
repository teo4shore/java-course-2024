package org.ethz.day3;

public class Network {
    // Data fields
    private Node[] nodes;  // Array of nodes
    private Link[] links;  // Array of links

    // Constructor to initialize the fields
    public Network(Node[] nodes, Link[] links) {
        this.nodes = nodes;
        this.links = links;
    }

    // Getter method for nodes
    public Node[] getNodes() {
        return nodes;
    }

    // Getter method for links
    public Link[] getLinks() {
        return links;
    }
}
