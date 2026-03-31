package com.gla.thread;

class EntryMonitor extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Student Entry Monitoring... " + i);
                Thread.sleep(2000);
            }
            System.out.println("Entry Monitoring Completed");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class QuestionDistribution extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Question Paper Distribution Started");
            for (int i = 1; i <= 3; i++) {
                System.out.println("Distributing Question Papers... " + i);
                Thread.sleep(2000);
            }
            System.out.println("Question Paper Distribution Completed");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class AttendanceMarking extends Thread {
    public void run() {
        try {
            Thread.sleep(10000);
            System.out.println("Attendance Marking Started");
            for (int i = 1; i <= 3; i++) {
                System.out.println("Marking Attendance... " + i);
                Thread.sleep(2000);
            }
            System.out.println("Attendance Marking Completed");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class AnswerSheetCollection extends Thread {
    public void run() {
        try {
            Thread.sleep(20000); // exam duration simulation
            System.out.println("Answer Sheet Collection Started");
            for (int i = 1; i <= 3; i++) {
                System.out.println("Collecting Answer Sheets... " + i);
                Thread.sleep(2000);
            }
            System.out.println("Answer Sheet Collection Completed");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ExamHallSystem {
    public static void main(String[] args) throws Exception {

        EntryMonitor entry = new EntryMonitor();
        QuestionDistribution question = new QuestionDistribution();
        AttendanceMarking attendance = new AttendanceMarking();
        AnswerSheetCollection collection = new AnswerSheetCollection();

        // Setting priorities
        question.setPriority(10);
        attendance.setPriority(8);
        collection.setPriority(7);
        entry.setPriority(5);

        // Thread states before start
        System.out.println("Entry State: " + entry.getState());
        System.out.println("Question State: " + question.getState());
        System.out.println("Attendance State: " + attendance.getState());
        System.out.println("Collection State: " + collection.getState());

        // Start threads
        entry.start();
        question.start();
        attendance.start();
        collection.start();

        // Thread states after start
        Thread.sleep(1000);
        System.out.println("Entry State After Start: " + entry.getState());
        System.out.println("Question State After Start: " + question.getState());
        System.out.println("Attendance State After Start: " + attendance.getState());
        System.out.println("Collection State After Start: " + collection.getState());

        // Wait for all threads to finish
        entry.join();
        question.join();
        attendance.join();
        collection.join();

        System.out.println("All Exam Hall Activities Completed");
    }
}
