package com.gla.thread;

class Order implements Runnable {

    private int orderId;
    private String restaurant;
    private int deliveryTime;   // in seconds

    public Order(int orderId, String restaurant, int deliveryTime) {
        this.orderId = orderId;
        this.restaurant = restaurant;
        this.deliveryTime = deliveryTime;
    }

    @Override
    public void run() {

        Thread t = Thread.currentThread();
        long startTime = System.currentTimeMillis();

        try {
            System.out.println("Agent: " + t.getName() +
                    " | Order ID: " + orderId +
                    " | Restaurant: " + restaurant +
                    " | Status: Picked Up");

            Thread.sleep(deliveryTime * 1000);

            System.out.println("Agent: " + t.getName() +
                    " | Order ID: " + orderId +
                    " | Status: In Transit");

            Thread.sleep(deliveryTime * 1000);

            System.out.println("Agent: " + t.getName() +
                    " | Order ID: " + orderId +
                    " | Status: Delivered");

            long endTime = System.currentTimeMillis();
            System.out.println("Order " + orderId +
                    " Total Delivery Time: " +
                    (endTime - startTime) / 1000 + " seconds");

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class FoodDeliverySystem {

    public static void main(String[] args) {

        Order o1 = new Order(101, "Dominos", 2);   // Express
        Order o2 = new Order(102, "KFC", 3);       // Standard
        Order o3 = new Order(103, "BurgerKing", 4);// Economy
        Order o4 = new Order(104, "PizzaHut", 2);  // Express
        Order o5 = new Order(105, "BiryaniHub", 3);// Standard

        Thread t1 = new Thread(o1, "Agent-A");
        Thread t2 = new Thread(o2, "Agent-B");
        Thread t3 = new Thread(o3, "Agent-C");
        Thread t4 = new Thread(o4, "Agent-D");
        Thread t5 = new Thread(o5, "Agent-E");

        // Setting Priorities
        t1.setPriority(10); // Express
        t4.setPriority(10); // Express
        t2.setPriority(5);  // Standard
        t5.setPriority(5);  // Standard
        t3.setPriority(3);  // Economy

        // Start all deliveries
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

