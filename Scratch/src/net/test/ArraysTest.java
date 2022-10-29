package net.test;

import java.util.Arrays;

class ArraysTest {
    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] = 55;
        ages[1] = 49;
        ages[2] = 8;
        ages[3] = 8;
        System.out.println(Arrays.toString(ages)); //toString auto created; Arrays.toString(ages) = [55, 49, 8,8]

        double[] temps = {65.5, 72.3, 80.0, 93.0, 67.6};
        System.out.println(Arrays.toString(temps));

        String[] sports = { "cricket", "pickle ball", "baseball", "soccer", "duck racing"};
        System.out.println(Arrays.toString(sports));

        for (String sport : sports) { // for each string sport in sports
            System.out.printf("I enjoy playing %s.\n", sport);
        }

        System.out.println();

        double sum = 0.0;
        for (double temp : temps) {
            sum += temp; // sum = sum + temp
        }
        double avg = sum / temps.length;
        System.out.printf("The avg temp is %s. ", avg);
    }
}