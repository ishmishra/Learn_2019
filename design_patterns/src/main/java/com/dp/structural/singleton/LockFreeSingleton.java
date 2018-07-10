package com.dp.structural.singleton;

/**
 * One of the best implementations of the singleton pattern in Java relies on the fact
 * that a class is loaded a single time. By instantiating the static member directly
 * when declared, we make sure that we have a single instance of the class. This
 * implementation avoids locking mechanisms and additional checking to see
 * whether the instance has already been created:
 */
public class LockFreeSingleton {

    private static final LockFreeSingleton instance
            = new LockFreeSingleton();

    private LockFreeSingleton() {
        System.out.println("Singleton Instance Instantiated:" + this.hashCode());
    }

    public static synchronized LockFreeSingleton getInstance() {
        return instance;
    }
}
