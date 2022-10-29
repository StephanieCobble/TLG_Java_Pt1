import java.util.Arrays;

/*
 * Business or system class to model the workings of a television set.
 * This class will NOT have a main() method - most classes don't.
 */
class Television {
    // static/shared variables
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = { "Samsung", "LG", "Sony", "Toshiba" };

    private static int instanceCount = 0;

    public static int getInstanceCount() { //getInstanceCount executes "up there"; shared instances occur outside of the bubble
        //boolean isConnected = verifyInternetConnection();
        // ^^Non-static method 'verifyInternetConnection()' cannot be referenced from a static context
        return instanceCount;
    }
    // properties or attributes - called "instance variables" or "fields"
    private String brand;
    private int volume;

    private DisplayType display = DisplayType.LED; //null w/o it by default
    private boolean isMuted; // default false (private, even tho lab said public

    private int oldVolume; //no accessor (get/set) methods
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

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    // Business methods (functions/operations)
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
    }
    public void turnOff() {
        System.out.println("TV shutting off");
    }

    public void mute() {  //pg 63
        //toggle mute/unmute
        if (!isMuted()) { //not muted; can use isMuted or isMuted(), generally want to call own getter
            oldVolume = getVolume(); // bc getVolume returns volume
            volume = 0;
            isMuted = true;
            // store current volume in oldVolume
            //set volume to zero
            // set muted flag to true
        } else { // currently muted
            setVolume(oldVolume);
            isMuted = false;
            // restore volume from oldVolume
            //set muted flag to false
        }
    }

    // Accessor methods, or Getters & Setters
    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public boolean isMuted() { //getter
        return isMuted;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (isValidBrand(brand)) {
            this.brand = brand;
        }
        else {
            String brands = Arrays.toString(VALID_BRANDS);
            System.out.println("Invalid brand: " + brand + ". Valid brands are " + brands + ".");
        }
    }

    private static boolean isValidBrand(String brand) {
        boolean isValid = false;

        for (String validBrand : VALID_BRANDS) {
            if (validBrand.equalsIgnoreCase(brand)) { //same as equals, but doesn't care about casing
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    public int getVolume() {
        return volume;
    }

    //setVolume: [0,100]
    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted = false;
        } else {
//            System.out.println("Invalid volume: " + volume + ". Please set volume between " +
//                    MIN_VOLUME + " and " + MAX_VOLUME + ".");
            System.out.printf("Invalid volume: %s. Please set volume between %s and %s.\n",
                    volume, MIN_VOLUME, MAX_VOLUME);
        }
    }

    // Lab pg 44
    private boolean verifyInternetConnection() {
        return true; // fake implementation
    }

    // toString
    public String toString() {
//        if(isMuted) {
//            return "Television: brand = " + getBrand() + ", volume = <muted>";
//        }
//        return "Television: brand = " + getBrand() + ", volume = " + getVolume(); //OR SEE BELOW
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());

        return String.format("Television: brand = %s, volume = %s, display = %s",
                getBrand(), volumeString, getDisplay());
//        return "Television: brand = " + getBrand() + ", volume = " + volumeString + ", display = " + getDisplay();
    }
}