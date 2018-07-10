package com.dp.structural.singleton;

public class SynchronizedSingletonDoubleCheck {

    private static SynchronizedSingletonDoubleCheck instance;

    //Make Constructor private
    private SynchronizedSingletonDoubleCheck() {

    }

    /**
     * The previous implementation is thread-safe but it introduces an unnecessary
     * delay: the block that checks whether the instance has already been created is
     * synchronized. This means that the block can be executed by only one thread at a
     * time, but locking makes sense only when the instance has not been created.
     * When the singleton instance has already been created, each thread can get the
     * current instance in an un-synchronized manner.
     *
     */
    public static SynchronizedSingletonDoubleCheck getInstance() {

        if (instance == null) {
            synchronized (SynchronizedSingleton.class) {
                if (instance == null) {
                    instance = new SynchronizedSingletonDoubleCheck();
                }
            }
            //Note that
            //is checked twice. This is necessary, because we have to
            //instance == null
            //make sure a check is done in the
            //block too.
            //synchronized
        }
        return instance;
    }

    public void display() {
        System.out.println("Hi I am a singleton instance with hashcode: " + this.hashCode());
    }


}
