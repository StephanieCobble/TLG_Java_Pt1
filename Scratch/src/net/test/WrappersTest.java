package net.test;

class WrappersTest {
    public static void main(String[] args) {
        String ageInput = "29";
        int age = Integer.parseInt(ageInput); // returns 29 from "29"
        Integer ageInteger = Integer.valueOf(ageInput); //returns Integer(29) from "29"

        String populationInput = "7500000000";
        long population = Long.parseLong(populationInput); //returns long from string
        Long populationLong = Long.valueOf(populationInput); // returns Long object from string

        String debtInput = "31000000000";
        double debt = Double.parseDouble(debtInput); // returns double from string
        Double debtDouble = Double.valueOf(debtInput); // returns Double from string

        String shoesInput = "true";
        boolean wearsShoes = Boolean.parseBoolean(shoesInput); // returns boolean from string
        Boolean shoesBoolean = Boolean.valueOf(shoesInput); // returns Boolean from string

        System.out.println(age);
        System.out.println(ageInteger);
    }
}