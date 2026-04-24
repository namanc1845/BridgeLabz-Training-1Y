package com.gla.regex;

public class ValidateCreditCard {
    public static void main(String[] args) {
        String card = "4123456789012345";

        if (card.matches("^[45][0-9]{15}$")) {
            System.out.println("Valid Credit Card");
        } else {
            System.out.println("Invalid Credit Card");
        }
    }
}