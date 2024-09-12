package org.ethz.day4;

// Activity.java
public interface Activity extends PlanElement {
    double getEndTime();
    void setEndTime(final double seconds);

    String getType();
    void setType(final String type);

    double getXCoord();
    double getYCoord();
}