/*
 * (Area and perimeter of a circle)
 * Write a program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formula:
 *                                              perimeter = 2 * radius * p
 *                                              area = radius * radius * p
 */

public class AreaAndPerimeterOfACircle {

    public static void main(String[] args) {

        // create variables for calculations
        double radius = 5.5;
        double pie = (4) * ((1.0) - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11));

        // preform calculations to be printed to the console
        double perimeter = (2) * (radius) * (pie);
        double area = (radius) * (radius) * (pie);

        // print result to the console
        System.out.println("The Perimeter is: " + perimeter);
        System.out.println("The Area is: " + area);
    }
}
