package org.organisms;// An immutable class.
// More correct - the class def is written in such a way that instances of it, i.e.,
// Person objects, once created, cannot have their properties change value.
// Simply put, getters & no setters

import java.time.LocalDate;
import java.time.Period;

class Person {
    private final String name;
    private final LocalDate birthDate;

    // ctor
    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Returns the person's age in whole years.
    // You can calculate this from two dates: i.e. today (LocalDate.now) - bday
    public int getAge() {
        return Period.between(getBirthDate(), LocalDate.now()).getYears();
    }

    // Getters
    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String toString() {
        return String.format("Person: name = %s, birthDate = %s", getName(), getBirthDate());
    }
}