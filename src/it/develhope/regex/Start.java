package it.develhope.regex;

public class Start {
    public static void main(String[] args) {
        String string = "x3z ? xYz ! R1 && __";
        String result = string.replaceAll("[a-z0-9]","*");
        System.out.println(result);
    }
}


