package com.gla.thread;

import java.util.*;

class Ticket extends Thread {

    private int ticketNo;
    private String type;
    private int priority;
    private int queuePosition;
    private static Random rand = new Random();
    private long waitTime;

    public Ticket(int ticketNo, String type, int priority, int queuePosition) {
        this.ticketNo = ticketNo;
        this.type = type;
        this.priority = priority;
        this.queuePosition = queuePosition;
        setPriority(priority);
        setName("Agent-" + ticketNo);
    }

    public long getWaitTime() {
        return waitTime;
    }

    public int getTicketPriority() {
        return priority;
    }

    @Override
    public void run() {

        try {
            int processTime = rand.nextInt(5) + 1; // 1–5 sec

            System.out.println("START → Ticket: " + ticketNo +
                    " | Type: " + type +
                    " | Agent: " + getName() +
                    " | Priority: " + priority +
                    " | Queue Position: " + queuePosition +
                    " | Processing Time: " + processTime + " sec");

            long start = System.currentTimeMillis();

            Thread.sleep(processTime * 1000);

            long end = System.currentTimeMillis();
            waitTime = (end - start) / 1000;

            System.out.println("COMPLETE → Ticket: " + ticketNo +
                    " handled by " + getName() +
                    " | Total Time: " + waitTime + " sec");

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class TicketSystem {

    public static void main(String[] args) throws Exception {

        List<Ticket> tickets = new ArrayList<>();

        // Creating 10 mixed tickets
        tickets.add(new Ticket(1, "Critical Bug", 10, 1));
        tickets.add(new Ticket(2, "Feature Request", 4, 5));
        tickets.add(new Ticket(3, "General Query", 2, 7));
        tickets.add(new Ticket(4, "Feedback", 1, 9));
        tickets.add(new Ticket(5, "Critical Bug", 10, 2));
        tickets.add(new Ticket(6, "General Query", 2, 8));
        tickets.add(new Ticket(7, "Feature Request", 4, 6));
        tickets.add(new Ticket(8, "Critical Bug", 10, 3));
        tickets.add(new Ticket(9, "Feedback", 1, 10));
        tickets.add(new Ticket(10, "Critical Bug", 10, 4));

        // Sort by priority (High → Low)
        tickets.sort((a, b) -> b.getTicketPriority() - a.getTicketPriority());

        // Start all tickets
        for (Ticket t : tickets) {
            t.start();
        }

        // Wait for completion
        for (Ticket t : tickets) {
            t.join();
        }

        // Statistics calculation
        Map<Integer, List<Long>> stats = new HashMap<>();

        for (Ticket t : tickets) {
            stats.putIfAbsent(t.getTicketPriority(), new ArrayList<>());
            stats.get(t.getTicketPriority()).add(t.getWaitTime());
        }

        System.out.println("\n===== Average Wait Time Per Priority =====");

        for (int p : stats.keySet()) {
            List<Long> times = stats.get(p);
            double avg = times.stream().mapToLong(Long::longValue).average().orElse(0);
            System.out.println("Priority " + p + " → Avg Wait Time: " + avg + " sec");
        }

        System.out.println("\nAll Tickets Processed Successfully");
    }
}
