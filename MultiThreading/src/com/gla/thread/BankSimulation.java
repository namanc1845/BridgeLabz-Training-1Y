package com.gla.thread;

class BankAccount implements Runnable {

    private String accountHolder;
    private String accountType;

    public BankAccount(String accountHolder, String accountType) {
        this.accountHolder = accountHolder;
        this.accountType = accountType;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();

        for (int i = 1; i <= 3; i++) {
            System.out.println(
                    "User: " + accountHolder +
                            " | Account Type: " + accountType +
                            " | Checking Balance (" + i + ")" +
                            " | Thread Priority: " + t.getPriority()
            );

            try {
                Thread.sleep(2000); // simulate balance checking time
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {

        BankAccount premiumUser = new BankAccount("Amit", "Premium");
        BankAccount regularUser = new BankAccount("Rahul", "Regular");
        BankAccount basicUser = new BankAccount("Sohan", "Basic");

        Thread t1 = new Thread(premiumUser);
        Thread t2 = new Thread(regularUser);
        Thread t3 = new Thread(basicUser);

        // Setting priorities
        t1.setPriority(10); // Premium
        t2.setPriority(5);  // Regular
        t3.setPriority(1);  // Basic

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}
