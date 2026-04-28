package com.logisticsroutetracker;

class RestCheckpoint extends Checkpoint {

    RestCheckpoint(String checkpointId, String locationName,
                   double distanceFromLast,
                   int expectedDuration,
                   int actualDuration) {

        super(checkpointId, locationName,
                distanceFromLast,
                expectedDuration,
                actualDuration);
    }

    boolean isCritical() {
        return false;
    }

    String getType() {
        return "Rest";
    }

    double calculatePenalty() {
        int delay = actualDuration - expectedDuration;

        if (delay > 30) {
            return delay * 0.5;
        }
        return 0;
    }
}
