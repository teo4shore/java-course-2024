package org.ethz.day4;

// ActivityImpl.java
public class ActivityImpl implements Activity {
    private double endTime;
    private String type;
    private double xCoord;
    private double yCoord;

    // Constructor
    public ActivityImpl(double endTime, String type, double xCoord, double yCoord) {
        this.endTime = endTime;
        this.type = type;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    // Implementing getEndTime() method
    @Override
    public double getEndTime() {
        return this.endTime;
    }

    // Implementing setEndTime() method
    @Override
    public void setEndTime(final double seconds) {
        this.endTime = seconds;
    }

    // Implementing getType() method
    @Override
    public String getType() {
        return this.type;
    }

    // Implementing setType() method
    @Override
    public void setType(final String type) {
        this.type = type;
    }

    // Implementing getXCoord() method
    @Override
    public double getXCoord() {
        return this.xCoord;
    }

    // Implementing getYCoord() method
    @Override
    public double getYCoord() {
        return this.yCoord;
    }
}

