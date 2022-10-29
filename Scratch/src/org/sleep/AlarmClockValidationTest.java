package org.sleep;

/*
 * Test class focused on validation logic of snoozeInterval in setSnoozeInterval
 * Boundary value testing (BVT): for a range of values [1, 20], we need to test:
 * 0,1 and 20,21
 */
class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        //1st check the boundaries for valid values
        clock.setSnoozeInterval(1); // no error msg, and the 1 should "stick"
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(20); // no error msg, and the 20 should "stick"
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(0); // error msg, and the 0 should not be applied
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval()); // should still be 20 after 0 rejected

        clock.setSnoozeInterval(21); // error msg, and the 21 should not be applied
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval()); // should still be 20 after 21 rejected
    }
}