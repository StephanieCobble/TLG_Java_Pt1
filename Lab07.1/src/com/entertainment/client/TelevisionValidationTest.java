package com.entertainment.client;/*
 * Test class focused on validation logic of volume in setVolume
 * Boundary value testing (BVT): for a range of values [0, 100], we need to test:
 * -1,0 and 100,101
 */

import com.entertainment.Television;

class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv = new Television();

        tv.setVolume(0);
        System.out.println("volume: " + tv.getVolume());

        tv.setVolume(100);
        System.out.println("volume: " + tv.getVolume());

        tv.setVolume(-1);
        System.out.println("volume: " + tv.getVolume());

        tv.setVolume(101);
        System.out.println("volume: " + tv.getVolume());

        tv.setBrand("Samsung");
        System.out.println("brand: " + tv.getBrand());

        tv.setBrand("LG");
        System.out.println("brand: " + tv.getBrand());

        tv.setBrand("Sony");
        System.out.println("brand: " + tv.getBrand());

        tv.setBrand("Toshiba");
        System.out.println("brand: " + tv.getBrand());

        tv.setBrand("Other");
        System.out.println("brand: " + tv.getBrand());
    }
}