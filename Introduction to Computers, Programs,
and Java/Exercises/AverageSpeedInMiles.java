/*
 * (Average speed in miles)
 * Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a program that displays the average speed in miles per hour.
 * (Note that 1 mile is 1.6 kilometers.)
 */

public class AverageSpeedInMiles {

    public static void main(String[] args) {

        // to convert from KPH to MPH we must use mph = kph / 1.6
        double mph = 14 / 1.6;

        //print to the console
        System.out.println("The average speed in miles per hour(mph) is: " + mph + " mph");
    }
}
