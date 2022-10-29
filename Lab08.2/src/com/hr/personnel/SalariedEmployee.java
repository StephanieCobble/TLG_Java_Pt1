package com.hr.personnel;
import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    //fields
    private double salary;

    // ctors
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    // business method
    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    public void takeVacation() {
        System.out.printf("%s is on vacation\n", getName());
    }

    // accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format(super.toString(), ", salary = %s\n", getSalary());
//        return String.format("Salaried Employee: name = %s, hireDate = %s, salary = %s.\n",
//                getName(), getHireDate(), getSalary());
    }
}