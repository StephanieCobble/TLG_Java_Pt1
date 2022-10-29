/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 2150.0));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 53.1, 40));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        System.out.println();
        dept.addEmployee(new SalariedEmployee("Jim", LocalDate.of(2012, 5, 2), 350000.0));
        dept.addEmployee(new HourlyEmployee("Bob", LocalDate.of(2013, 10,31), 31.13, 40));
        dept.addEmployee(new Executive("Jane", LocalDate.of(2010, 6, 6), 50_000.0));

        System.out.println();
        dept.listEmployees();
        dept.workEmployees();

        System.out.println();
        dept.payEmployees();

        // holiday break
        System.out.println("Holiday Break:");
        dept.holidayBreak();
    }
}