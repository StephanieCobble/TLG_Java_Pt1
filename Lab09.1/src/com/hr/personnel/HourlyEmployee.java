package com.hr.personnel;
import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    public static final double HOURLY_STANDARD_DEDUCTION = 2300.0;

    // fields
    private double rate;
    private double hours;

    // ctors
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate); // delegate upstairs
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate); // delegate next door
        setRate(rate);
        setHours(hours);
    }

    //business method
    @Override
    public void pay() {
        System.out.println(getName() + " is paid hourly " + (getRate() * getHours()));
    }

    @Override
    public void payTaxes() {
        System.out.printf("%s paid taxes of %s\n", getName(), (getRate() * getHours() * HOURLY_TAX_RATE));
    }

    @Override
    public double getStandardDeduction() {
        return HOURLY_STANDARD_DEDUCTION;
    }

    // accessor methods
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return String.format(super.toString(), ", hours = %s, rate = %s\n", getHours(), getRate());
//        return String.format("Hourly Employee: name = %s, hireDate = %s, rate = %s, hours = %s.\n",
//                getName(), getHireDate(), getRate(), getHours());
    }
}