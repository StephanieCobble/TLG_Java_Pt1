/*
 * Business or system class to model the workings of a television set.
 * This class will NOT have a main() method - most classes don't.
 */
class Television {
    // static/shared variables
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;
    // properties or attributes - called "instance variables" or "fields"
//    String brand = "Toshiba"; //Usually default null; new default when not provided
//    int volume = 1; // Default usually 0; ^^ ditto
    private String brand;
    private int volume;

    // constructors
    public Television() {
        instanceCount++;
        // no-op ctor
    }

    public Television(String brand) { // this *
        this(); //lab book pg 55; Delegates to the no-arg ctor for the instanceCount increment
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand); // refers to * (above)
        setVolume(volume);
    }

    // Business methods (functions/operations)
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
    }
    public void turnOff() {
        System.out.println("TV shutting off");
    }

    // Accessor methods, or Getters & Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        switch (brand) {
            case "Samsung": case "LG": case "Sony": case "Toshiba":
                this.brand = brand;
                break;
            default:
                System.out.println("Invalid brand: " + brand + ". Please choose Samsung, LG, Sony, or Toshiba.");
        }
    }

    public int getVolume() {
        return volume;
    }

    //setVolume: [0,100]
    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
        } else {
            System.out.println("Invalid volume: " + volume + ". Please set volume between " +
                    MIN_VOLUME + " and " + MAX_VOLUME + ".");
        }
    }

    public static int getInstanceCount() { //getInstanceCount executes "up there"; shared instances occur outside of the bubble
        //boolean isConnected = verifyInternetConnection();
        // ^^Non-static method 'verifyInternetConnection()' cannot be referenced from a static context
        return instanceCount;
    }

    // Lab pg 44
    private boolean verifyInternetConnection() {
        return true; // fake implementation
    }

    // toString
    public String toString() {
        return "Television: brand = " + getBrand() + ", volume = " + getVolume();
    }
}