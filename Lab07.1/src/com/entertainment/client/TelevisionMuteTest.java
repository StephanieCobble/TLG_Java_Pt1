package com.entertainment.client;

import com.entertainment.Television;

class TelevisionMuteTest {
    public static void main(String[] args) {
        Television tv = new Television("Samsung", 32);
        System.out.println(tv);

        tv.mute(); // mute
        System.out.println(tv);

        tv.mute(); // unmute
        System.out.println(tv);

        tv.mute(); // mute again
        System.out.println(tv);

        tv.setVolume(50); // set vol to 50 & unmute
        System.out.println(tv);
    }
}