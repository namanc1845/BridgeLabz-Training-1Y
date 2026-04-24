package com.gla.regex;

import java.util.regex.*;
public class RepeatingWords {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        Pattern p = Pattern.compile("\\b(\\w+)\\s+\\1\\b");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group(1));
        }
    }
}