package com.dp.structural.singleton;

public class Singleton {

    private static Singleton instance;

    //Make Constructor private
    private Singleton() {

    }

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void display() {
        System.out.println("Hi I am a singleton instance with hashcode: " + this.hashCode());
    }


}
