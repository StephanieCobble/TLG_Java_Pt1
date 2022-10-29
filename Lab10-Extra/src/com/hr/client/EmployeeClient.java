package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;
//import com.transportation.DestinationUnreachableException; // for OPTIONS 1-3

public class EmployeeClient {

    public static void main(String[] args) {
        // TODO: create an instance of Employee
        Employee emp = new Employee("Steph");

        // TODO: call goToWork() on the Employee object
        try { //for option 4
            emp.goToWork();
        } catch (WorkException e) {
            System.out.println(e); // the WorkException
            System.out.println(e.getCause()); //underlying root of the problem (the DestinationUnreachableException)
            e.printStackTrace();
        }

        // For options 1-3
//        try { //for option 2, need a try-catch in main (never throws on main)
//            emp.goToWork();
//        } catch (DestinationUnreachableException e) {
//            System.out.println(e);
////            System.out.printf("ERROR: %s", e.getMessage());
//        }

    }
}