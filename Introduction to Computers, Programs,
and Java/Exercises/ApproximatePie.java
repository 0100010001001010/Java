/*
 * (ApproximatePie) p can be computed using the following formula:
 *      p = (4) * ( 1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) + ...... )
 * 
 * Write a program that displays the result of:
 *      p = (4) * ( 1.0 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) )
 * 
 *                              and
 * 
 *      p = (4) * ( 1 - (1/3) + (1/5) - (1/7) + (1/9) - (1/11) +(1/13) )
 * 
 * 
 * 
 * Use 1.0 instead of 1 in your program.
 */

public class ApproximatePie {

    public static void main(String[] args) {
        /*
             * Create and store variables for calculating pie
             * to be displayed to the console
         */
        double pie1 = (4) * ((1.0) - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11));
        double pie2 = (4) * ((1.0) - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11) + (1 / 13));


        /*
         *  display pie1 and pie2 to the console
         */
        System.out.println("The value of pie1 is: " + pie1);
        System.out.println("The value of pie2 is: " + pie2);
    }
}
