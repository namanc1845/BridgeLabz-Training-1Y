package com.gla.Exception;

import java.util.Scanner;

class BankAccount {

    double balance = 5000;

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount < 0) {
            throw new IllegalArgumentException();
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();

        try {
            double amt = sc.nextDouble();
            b.withdraw(amt);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }

        sc.close();
    }
}