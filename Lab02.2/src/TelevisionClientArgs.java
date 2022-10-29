/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import java.util.Arrays;

/**
 * Intended usage (by human):
 *  $ java TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>\n" +
                    "Example: java TelevisionClientArgs Samsung 32 PLASMA\n" +
                    "Notes:\n" +
                    " 1. Supported brands are " + Arrays.toString(Television.VALID_BRANDS) + ".\n" +
                    " 2. Volume must be " + Television.MIN_VOLUME + " to " + Television.MAX_VOLUME + " (inclusive).\n" +
                    " 3. Supported displays are " + Arrays.toString(DisplayType.values()) + ".";
//            String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
//            String note = "Note: supported displays are LED, OLED, LCD, CRT, PLASMA";
            System.out.println(usage);
//            System.out.println(example);
//            System.out.println(note);
            return;  // early return from main(), application exits
        }

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        // System.out.println("You provided " + args.length + " arguments");

        // Step 1: convert each arg as necessary to the proper types
        // args[0] for brand needs to be String, & already is
        // args[1] for volume needs to be int, you'll need to convert [Integer, parseInt()]
        // args[2] for display needs to be DisplayType, you'll need to convert [DisplayTyple.valueOf]
        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType display = DisplayType.valueOf(args[2].toUpperCase());

        // Step 2: create a new Television object with your converted values
        // You can use the 3-arg brand-volume-display ctor
        Television tv = new Television(brand, volume, display);

        // Step 3: print the Television object & congratulations
        System.out.println("Order placed, thank you!");
        System.out.println("Your custom television has shipped!");
        System.out.println(tv);
    }
}