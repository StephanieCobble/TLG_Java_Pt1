package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {

    //ctors (in cases like this, need a super, but can also call this.
    public Executive() {
        // super();
    }

    public Executive(String name, LocalDate hireDate) {
        super(name, hireDate);
        // could give them membership at the club
    }

    public Executive(String name, LocalDate hireDate, double salary) {
        this(name, hireDate); // would be fine to just go to super w/ the salary in there too
        setSalary(salary);
    }

    // business methods
    @Override
    public void work() {
        System.out.printf("%s is enjoying a nice round of golf at the club\n", getName());
    }
}