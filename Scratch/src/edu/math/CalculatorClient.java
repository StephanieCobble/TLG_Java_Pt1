package edu.math;

import static edu.math.Calculator.*; //ok to use * for static import

class CalculatorClient {
    public static void main(String[] args) {

        double sum = add(3,5); //can do this now bc of the import above
//        double sum = Calculator.add(3, 5);
        System.out.println("The sum is " + sum);

        System.out.println("The difference is " + Calculator.subtract(3, 10)); //can also just method inline

        boolean answer = Calculator.isEven(10); // can right click > refactor > rename to change all variables
        System.out.println("Result " + answer);

        System.out.println();

        int winner = Calculator.randInt();
        System.out.println("The winner is " + winner);

        int winnerRange = Calculator.randInt(5, 75);
        System.out.println("The new winner is " + winnerRange);

        System.out.println();

        System.out.printf("The AVERAGE is %s\n", Calculator.average(5, 8, 3, 6));

//        int[] ages = { 8, 8, 7, 5, 4, 1, 9,6, 6 }; // can't really use array
//        System.out.printf("The average age at the party was : %s.", Calculator.average(0, ages)); // only can if you add an int, then array

    }
}