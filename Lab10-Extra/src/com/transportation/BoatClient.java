package com.transportation;

class BoatClient {
    public static void main(String[] args) {
        Boat boat1 = new Boat("BBB"); // If using Vehicle, need to handle checked
        boat1.moveTo("West Seattle");
    }
}