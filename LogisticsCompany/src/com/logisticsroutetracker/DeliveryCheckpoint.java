package com.logisticsroutetracker;

class DeliveryCheckpoint extends Checkpoint {

    DeliveryCheckpoint(String checkpointId, String locationName,
                       double distanceFromLast,
                       int expectedDuration,
                       int actualDuration) {

        super(checkpointId, locationName,
                distanceFromLast,
                expectedDuration,
                actualDuration);
    }

    boolean isCritical() {
        return true;
    }

    String getType() {
        return "Delivery";
    }

    double calculatePenalty() {
        if (isDelayed()) {
            return (actualDuration - expectedDuration) * 2;
        }
        return 0;
    }
}
