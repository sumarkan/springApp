package com.example.SpringDemo.learning.java14;

import com.example.SpringDemo.learning.Point;

public class Java14Features {
    public static void main(String[] args) {
//        System.out.println(getDayName(8));
//        instanceOF();;
        records();
        npeMessage();

    }

    private static void npeMessage() {
        String str = null;
        System.out.println(str.isBlank()); // Results in a clearer NullPointerException message
    }

    private static void records() {
        // Usage:
        Point p = new Point(10, 20);
        System.out.println("X: " + p.x() + ", Y: " + p.y());

    }


    // Java 14
//    https://medium.com/@javatechie/the-evolution-of-switch-statement-from-java-7-to-java-17-4b5eee8d29b7
    public static String getDayName(int day) {

        String dayName = switch (day) {
            case 1, 8, 15 -> "First day of the week";
            case 7 -> "Last day of the week";
            default -> "Some other day";
        };
        return dayName;
    }

    public static void instanceOF() {
        Object obj = "Hello";
        if (obj instanceof String str) {
            // Use 'str' directly as a String here
            System.out.println(str.toUpperCase());
        } else {
            // 'obj' is not a String
        }

    }
}
