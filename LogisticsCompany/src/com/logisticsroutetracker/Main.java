package com.logisticsroutetracker;

public class Main {

    public static void main(String[] args) {

        Driver d = new Driver("D1204", "Kavita Nair");

        d.routeHistory.addCheckpoint(
                new DeliveryCheckpoint(
                        "C1",
                        "Warehouse A",
                        30,
                        20,
                        30
                )
        );

        d.routeHistory.addCheckpoint(
                new FuelCheckpoint(
                        "C2",
                        "Pump 12",
                        20,
                        15,
                        15
                )
        );

        d.routeHistory.addCheckpoint(
                new RestCheckpoint(
                        "C3",
                        "Motel X",
                        25,
                        20,
                        25
                )
        );

        d.routeHistory.addCheckpoint(
                new DeliveryCheckpoint(
                        "C4",
                        "Client Hub",
                        45,
                        30,
                        45
                )
        );

        d.showSummary();
    }
}