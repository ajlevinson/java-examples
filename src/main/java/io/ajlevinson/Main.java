package io.ajlevinson;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Java Examples - Basic");

        for(String value: args) {
            System.out.println("The arg is: " + value);
        }
    }
}