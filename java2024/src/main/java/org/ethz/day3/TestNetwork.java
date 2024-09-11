package org.ethz.day3;  // Since they are all in this package they are accessible 

public class TestNetwork {

    public static void main(String[] args) {
        // Step 1: Create 4 nodes for a rectangular network
        Node node1 = new Node(0.0, 0.0, "Node1");  // Bottom-left corner
        Node node2 = new Node(10.0, 0.0, "Node2"); // Bottom-right corner
        Node node3 = new Node(0.0, 5.0, "Node3");  // Top-left corner
        Node node4 = new Node(10.0, 5.0, "Node4"); // Top-right corner
        
        // Step 2: Create links between the nodes
        String[] modes = {"car", "bike", "bus"};
        Link link1 = new Link(node1, node2, "Link1", modes, 10.0, 60, 1000.0); // Horizontal bottom link
        Link link2 = new Link(node2, node4, "Link2", modes, 5.0, 60, 1000.0);  // Vertical right link
        Link link3 = new Link(node4, node3, "Link3", modes, 10.0, 60, 1000.0); // Horizontal top link
        Link link4 = new Link(node3, node1, "Link4", modes, 5.0, 60, 1000.0);  // Vertical left link

        // Step 3: Store nodes and links in arrays
        Node[] nodes = {node1, node2, node3, node4};
        Link[] links = {link1, link2, link3, link4};

        // Step 4: Create a Network
        Network network = new Network(nodes, links);

        // Step 5: Display the coordinates of all nodes in the network
        System.out.println("Coordinates of nodes in the network:");
        for (Node node : network.getNodes()) {
            System.out.println(node.getId() + ": (" + node.getX() + ", " + node.getY() + ")");
        }
    }
}
