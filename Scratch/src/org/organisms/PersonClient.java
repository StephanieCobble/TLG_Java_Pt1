package org.organisms;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Steph", LocalDate.of(1992, 11, 8));
        System.out.println(p1);

        // TODO: print this message <name> is <years> old
        System.out.printf("%s is %s years old ", p1.getName(), p1.getAge());
    }
}