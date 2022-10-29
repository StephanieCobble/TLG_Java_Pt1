package org.sleep;

/*
 * Client-side "main-class" (a class with the main() method).
 * Create a few AlarmClock objects and give them a basic test-drive.
 */
class AlarmClockClient {

    //starting point or entry point for every standalone Java application.
    public static void main(String[] args) {
        // create an instance of AlarmClock (an AlarmClock object) and set its properties
        AlarmClock clock1 = new AlarmClock();
        // clock1.snoozeInterval = 7; DON'T directly pass it in, use set
        clock1.setSnoozeInterval(AlarmClock.MAX_INTERVAL); //bc public client can see what the max (or min) is
        clock1.setRepeat(5);
        // make 'clock1' snooze
        clock1.snooze();

        // create another AlarmClock object and set its properties, too
        AlarmClock clock2 = new AlarmClock(10, 10); // using new constructor & repeat ctor
        // clock2.snoozeInterval = 10;
        // clock2.setSnoozeInterval(10);
        // make 'clock2' snooze
        clock2.snooze();

        // Create a 3rd instance, but this time don't set snoozeInterval
        AlarmClock clock3 = new AlarmClock();
        // make clock3 snooze
        clock3.snooze();

        // toString method
        System.out.println();

        System.out.println(clock1.toString());
        System.out.println(clock2.toString());
        System.out.println(clock3.toString());
    }
}