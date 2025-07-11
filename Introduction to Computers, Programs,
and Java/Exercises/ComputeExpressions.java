/*
 * (Compute expressions) Write a program that displays the result of
 *                        9.5 * 4.5 - 2.5 * 3
 *                       ---------------------
 *                            45.5 - 3.5
 */

public class ComputeExpressions {

    public static void main(String[] args) {
        // make a variable to compute the equations
        double a = 9.5 * 4.5;
        double b = 2.5 * 3;
        double c = 45.5 - 3.5;

        // compute and print to the console
        System.out.println((a - b) / (c));
    }
}
