package org.sleep;

/*
 * Class definition to model the workings of an alarm clock.
 * This class does NOT have a main() method (most classes don't).
 * This is often called a "business" class or "system" class.
 */
class AlarmClock {

    // class-level, or shared/static, variables - only one copy of each
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;
    private static int nextId = 1;

    // properties or characteristics - called "fields" or "instance variables"
    private int snoozeInterval = 5; //default value when client doesn't provide snoozeInterval
    private int repeat = 1; // number of times alarm goes off
    private int id;

    // constructors - special methods get called when the client says "new"
    public AlarmClock() {
        this.id = nextId++;
        //no-op
    }
    public AlarmClock(int snoozeInterval) {
        this();
        setSnoozeInterval(snoozeInterval); // delegate to setter for any validation/conversion
    }

    public AlarmClock(int snoozeInterval, int repeat){
        this(snoozeInterval); // delegate to 1-arg ctor for snoozeInterval
        setRepeat(repeat);    // handle repeat by delegating to its setter
    }

    // methods (in Java - (functions in other languages; or operations)
    // business/action methods
    public void snooze() {
        System.out.println("Snoozing for " + getSnoozeInterval() + " minutes");
    }

    // accessor methods or getter and setter methods
    // provide controlled access to the object's internal (private) data
    // right click -> generate -> getters & setters
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // business rule: incoming value must be [1,20]
    public void setSnoozeInterval(int snoozeInterval) {
        // if snoozeInterval is >=1 and <=20, accept input, else error
        // this.snoozeInterval = snoozeInterval; // this. is a self reference
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;
        } else {
            System.out.println("Invalid snoozeInterval: " + snoozeInterval + ". Please snooze between " +
                    MIN_INTERVAL + " and " + MAX_INTERVAL + ".");
        }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "AlarmClock: id = " + getId() + ", snoozeInterval = " + getSnoozeInterval() + ", repeat = " + getRepeat(); // call your own getter, mine auto did it
    }
}