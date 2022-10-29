package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
    /*
     * OPTION 4: try-catch the DestinationUnreachableException from Car,
     * which is a low-level transportation oriented exception
     * & throw a higher-level, more HR-oriented exception back at my client.
     */
    public void goToWork() throws WorkException {

        Car c = new Car("ABC1313", "Subaru", "Legacy");

        try {
            c.start();
            c.moveTo("West Seattle");
            System.out.println("Arrived at work");
        } catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e); // e is the nested "cause"
        } finally {
            c.stop();
        }
    }

    /*
     * OPTION 3: try-catch, "responds" in some way, then re-throw the exception.
     * Note that since I'm re-throwing the exception, my client must deal with it.
     */
    /*
    public void goToWork() throws DestinationUnreachableException {

        Car c = new Car("ABC1313", "Subaru", "Legacy");

        try {
            c.start();
            c.moveTo("West Seattle");
            System.out.println("Arrived at work");
        } catch (DestinationUnreachableException e) {
//            e.printStackTrace();
            System.out.println("Email Lisa Herbold to complain");
            throw e;
        } finally {
            c.stop();
        }
    }
     */

    /*
     * OPTION 2: "punt", i.e., completely ignore it.
     * No try-catch here. I'm going to "throw up my hands".
     * Note that I can still get stop() dealt with, by using a try-finally.
     */
    /*
    public void goToWork() throws DestinationUnreachableException {

        Car c = new Car("ABC1313", "Subaru", "Legacy");

        try {
            c.start();
            c.moveTo("West Seattle");
            System.out.println("Arrived at work");
        } finally {
            c.stop();
        }
    }
     */

    /*
     * OPTION 1: try-catch & handle, the exception "stops here"
     * This means my client (EmployeeClient) doesn't have to deal with any of this.
     * Note also that we use finally to ensure that stop() is called, no matter what
     */
    /*
    public void goToWork() {

        Car c = new Car("ABC1313", "Subaru", "Legacy");

        try {
            c.start();
            c.moveTo("West Seattle");
            System.out.println("Arrived at work");
        } catch (DestinationUnreachableException e) {
//            e.printStackTrace();
            System.out.println("Error" + e.getMessage()); // toString() auto called for just e; getMessage - just the "reason" message
        } finally {
            c.stop();
        }
    }
     */

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}