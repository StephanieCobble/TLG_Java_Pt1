package edu.math;

import java.util.Random;
import static java.lang.Math.*;

/*
 * Class which contains several functions (methods) to do some basic calculations.
 *
 * "All-static" class is one that has nothing except static methods.
 * It has no "state" i.e., no instance variable or fields.
 */
class Calculator {

    // Returns the avg (mean) of the supplied integers.
    // Require the client to pass at least one
    public static double average(int first, int... rest) { // varargs; require at least 1
        double result = 0.0;

        double sum = first;
        for (int value : rest) {
            sum += value; //sums = sum + value
        }
        result = sum / (rest.length + 1);
        return result;
    }

    /**
     * Returns a random integer b/t 'min' & 'max' (inclusive). Ex 5 to 75.
     * calc.someMethod(5, 75) <- client caller
     * CHALLENGE (optional): implement this
     */
    public static int randInt(int min, int max) { //two methods w/ same name is method overloading
        // See notes for day 5 for other examples.
        // int result = 0;

        Random result = new Random();

        return result.nextInt((max - min) + 1);
    }

    // Jay's result for the above problem
    public static int randInt2(int min, int max) {
        int result = 0;

        double rand = random(); // 0.0000  to 0.9999 // can do this now bc of the above import
//        double rand = Math.random(); // 0.0000  to 0.9999
        double scaled = rand * (max - min + 1); // 0.0000  to 70.9999
        result = (int) (scaled + min); //5.0000 to 75.9999

        return result;
    }

    /**
     * Returns a random int b/t 1 & 21 (inclusive).
     *
     * HINT: see a class called Math (in package java.lang), look for a helpful method here.
     * NOTE: the methods in the Math class are all "static", which means you call them like so:
     * Math.methodName()
     */

    public static int randInt() {
        // declare return value (a local variable)
        int result = 0;

        double rand = Math.random();     // 0.0000  to 0.99999
        double scaled = (rand * 21) + 1; // 1.0000  to 21.99999
        result = (int) scaled;           // 1       to 21

        return result;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }


    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

/*    double multiply(double a, double b) {
 *        return a * b;
 *    }
 *
 *    double divide(double a, double b) {
 *        return a / b;
 *    }
 */


}