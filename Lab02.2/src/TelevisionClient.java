/*
 * Client side "main-class" (class with the main() method).
 * It will test-drive a few instances of Television, i.e., Television objects.
 */
class TelevisionClient {
    public static void main(String[] args) {

        System.out.println(Television.getInstanceCount() + " instances \n");

        Television tv1 = new Television();
        tv1.setVolume(Television.MAX_VOLUME);
        tv1.setBrand("Sony");
        tv1.turnOn();
        tv1.turnOff();
        tv1.setDisplay(DisplayType.PLASMA);
        System.out.println();

        Television tv2 = new Television();
        tv2.setVolume(Television.MIN_VOLUME);
        tv2.setBrand("Samsung");
        tv2.turnOn();
        tv2.turnOff();
        System.out.println();

        Television tv3 = new Television();
        tv3.turnOn();
        tv3.turnOff();
        System.out.println();

        Television tv4 = new Television("Sony", 50, DisplayType.OLED);
        tv4.turnOn();
        tv4.turnOff();
        System.out.println();

        Television tv5 = new Television("LG");
        tv5.turnOn();
        tv5.turnOff();

        System.out.println();

        System.out.println(tv1.toString());
        System.out.println(tv2); // auto calls toString
        System.out.println(tv3);
        System.out.println(tv4);
        System.out.println(tv5);

        System.out.println();

        System.out.println(Television.getInstanceCount() + " instances");
    }
}