package it.snip;

public class Scissors {
    //This is a "static initializer block"
    //This block is executed when the JVM Classloader loads Scissors.class into the JVM
    static {
        System.out.println("Scissors.class loaded into memory");
    }

    public static void staticMethod() {
        System.out.println("staticMethod has been called");
    }

    // fields/instance variables
    private String color;
    private double bladeLength;
    private int sharpness = 5; //constraint: [1-10]
    private boolean isLefty;

    //constructors (ctor) - special methods that get called when the client says "new"
    public Scissors() {
        //no-op constructor (if you have no constructors, the compiler will create a blank one)
    }

    public Scissors(String color, double bladeLength, int sharpness) {
        setColor(color);
        setBladeLength(bladeLength);
        setSharpness(sharpness);
    }

    public Scissors(String color, double bladeLength, int sharpness, boolean isLefty) {
        //delegate to each setter, for any validation/conversion
//        setColor(color);
//        setBladeLength(bladeLength);
//        setSharpness(sharpness);
        this(color, bladeLength, sharpness); // delegate to 3-arg ctor for color, bladeLength, sharpness
        setLefty(isLefty); // deal w/ isLefty, by delegating to its setter
    }

    // business/action methods
    public void cut() {
        System.out.printf("The %s sicssors are cutting.", getColor());
    }
    //poke(), sharpen(), trim(), stab()

    // Accessors methods or Getters & Setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
    }

    public int getSharpness() {
        return sharpness;
    }

    public void setSharpness(int sharpness) {
        this.sharpness = sharpness;
    }

    public boolean isLefty() {
        return isLefty;
    }

    public void setLefty(boolean lefty) {
        isLefty = lefty;
    }

    // toString
    public String toString() {
        return "Scissors: color = " + getColor() + ", bladeLength = " + getBladeLength() + ", sharpness = " +
                getSharpness() + ", isLefty = " + isLefty(); // call your own getter, mine auto did it
    }
}