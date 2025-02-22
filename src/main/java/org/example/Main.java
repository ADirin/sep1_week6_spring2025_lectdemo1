package org.example;

/**
 * This is a test program for demonstrating Jenkins integration.
 * Students should try running and modifying this code themselves.
 */
public class Main {

    /**
     * Main method to execute the program.
     *
     * @param args the command-line arguments
     */
    public static void main(final String[] args) {
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("Speed: " + calculateSpeed(100, 10));
    }

    /**
     * Calculates speed based on distance and time.
     *
     * @param distance the total distance traveled
     * @param time the time taken
     * @return speed as distance/time
     */
    public static double calculateSpeed(final double distance, final double time) {
        return distance / time;
    }
}
