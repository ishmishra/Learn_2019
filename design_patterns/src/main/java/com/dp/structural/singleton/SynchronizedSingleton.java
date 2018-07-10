package com.dp.structural.singleton;

public class SynchronizedSingleton {

    private static SynchronizedSingleton instance;

    //Make Constructor private
    private SynchronizedSingleton() {

    }

    public static synchronized SynchronizedSingleton getInstance() {

        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }

    public void display() {
        System.out.println("Hi I am a singleton instance with hashcode: " + this.hashCode());
    }


}
