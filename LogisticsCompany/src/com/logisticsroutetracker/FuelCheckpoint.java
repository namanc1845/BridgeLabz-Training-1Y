package com.logisticsroutetracker;

class FuelCheckpoint extends Checkpoint {

    FuelCheckpoint(String checkpointId, String locationName,
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
        return "Fuel";
    }

    double calculatePenalty() {
        if (isDelayed()) {
            return 10;
        }
        return 0;
    }
}
