package net.test;

class PrimitivesTest {

    public static void main(String[] args) {
        int age = 29;
        System.out.println("The age is " + age);

        long population = 8_000_000_000L;
        System.out.println("The world's population is " + population + " billion");

        double bladeLength = 1.75;
        System.out.println("Blade length is " + bladeLength);

        boolean isStressed = false;
        System.out.println("The value of isStressed is " + isStressed);

        char size = 'L'; //only one character
        System.out.println("The size is " + size);

        String grade = "A";
        System.out.println("My grade is " + grade + "\n"); // The \n is new line

        String quote = "What's up, \"Doc\"?"; // THe \" give literal quotes so output is "Doc"
        System.out.println("Bugs Bunny often says " + quote);

        System.out.println("\n"); // blank line in output

        int i = 18;
        // i = 55;
        int j = i + 2;
        System.out.println("The answer is: " + j);
    }
}