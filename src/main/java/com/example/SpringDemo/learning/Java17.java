package com.example.SpringDemo.learning;

public class Java17 {
    public static void main(String[] args) {
//        System.out.println(patternMatching(5));
//        System.out.println(patternMatching("Hello"));
//        System.out.println(patternMatching(new Employee()));
        instanceOF();
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

    private static String patternMatching(Object obj) {
        // Its a preview feature.
//        return switch (obj) {
//            case Integer i -> "It is an integer";
//            case String s -> "It is a string";
//            case Employee s -> "It is a Employee";
//            default -> "It is none of the known data types";
//        };
        return null;
    }

    public static String getDayName(int day) {

        String dayName = switch (day) {
            case 1, 8, 15 -> "First day of the week";
            case 7 -> "Last day of the week";
//            case null -> "It is a null object";

            default -> "Some other day";
        };
        return dayName;
    }

}
