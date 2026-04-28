package com.logisticsroutetracker;

class RouteLinkedList<T extends Checkpoint> {

    Node<T> head;

    void addCheckpoint(T checkpoint) {
        Node<T> newNode = new Node<>(checkpoint);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    boolean removeCheckpoint(String checkpointId) {
        if (head == null) {
            return false;
        }

        if (head.data.checkpointId.equals(checkpointId)) {
            head = head.next;
            return true;
        }

        Node<T> temp = head;

        while (temp.next != null) {
            if (temp.next.data.checkpointId.equals(checkpointId)) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    T findCheckpoint(String checkpointId) {
        Node<T> temp = head;

        while (temp != null) {
            if (temp.data.checkpointId.equals(checkpointId)) {
                return temp.data;
            }
            temp = temp.next;
        }

        return null;
    }

    double computeTotalDistance() {
        double total = 0;
        Node<T> temp = head;

        while (temp != null) {
            total += temp.data.distanceFromLast;
            temp = temp.next;
        }

        return total;
    }

    double computeTotalPenalty() {
        double total = 0;
        Node<T> temp = head;

        while (temp != null) {
            total += temp.data.calculatePenalty();
            temp = temp.next;
        }

        return total;
    }

    boolean consistencyCheck() {
        boolean hasDelivery = false;
        boolean hasFuel = false;

        Node<T> temp = head;

        while (temp != null) {
            if (temp.data.getType().equals("Delivery")) {
                hasDelivery = true;
            }

            if (temp.data.getType().equals("Fuel")) {
                hasFuel = true;
            }

            temp = temp.next;
        }

        return hasDelivery && hasFuel;
    }

    void printRoute() {
        Node<T> temp = head;
        int count = 1;

        while (temp != null) {
            System.out.println(
                    count + ". " +
                            temp.data.getClass().getSimpleName() +
                            " - " +
                            temp.data.locationName +
                            " - " +
                            (temp.data.isDelayed() ? "Delayed" : "On Time") +
                            " - Penalty: " +
                            temp.data.calculatePenalty()
            );

            count++;
            temp = temp.next;
        }
    }
}
