package com.transportation;

public class Car extends Vehicle {
    // INSTANCE VARIABLES
    private String make;
    private String model;

    // CONSTRUCTORS
    public Car(String vin) {
        super(vin);
    }

    public Car(String vin, String make, String model) {
        this(vin);
        setMake(make);
        setModel(model);
    }

    // BUSINESS METHODS
    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public void moveTo(String location) throws DestinationUnreachableException {
        if (location.equals("West Seattle")) {
            throw new DestinationUnreachableException("Uh-oh, the bridge is out! Please re-route.");
        }
        System.out.println(getMake() + " " + getModel() + " moving to " + location); // don't need else when throw setup
    }

    // ACCESSOR METHODS
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return super.toString() + ", make=" + getMake() + ", model=" + getModel();
    }
}