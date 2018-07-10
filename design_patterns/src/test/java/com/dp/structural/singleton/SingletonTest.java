package com.dp.structural.singleton;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.Assert.assertEquals;

public class SingletonTest {

    @Test
    public void testSingleton() {
        System.out.println("******************SINGLE THREAD***************************");
        Singleton singleton = Singleton.getInstance();
        singleton.display();
        Singleton singleton1 = Singleton.getInstance();
        singleton1.display();

        assertEquals("Not a singleton pattern", singleton.hashCode(), singleton1.hashCode());
    }

    //Below test shows that our current Singleton implementation is unfit in multithreaded situations
   /* @Test
    public void testSyncSingleton() throws InterruptedException {
        ExecutorService executor = Executors.newWorkStealingPool();

        List<Callable<Integer>> callables = Arrays.asList(
                () -> Singleton.getInstance().hashCode(),
                () -> Singleton.getInstance().hashCode(),
                () -> Singleton.getInstance().hashCode());

        executor.invokeAll(callables)
                .stream()
                .map(future -> {
                    try {
                        return future.get();
                    } catch (Exception e) {
                        throw new IllegalStateException(e);
                    }
                })
                .forEach(System.out::println);
    }*/
}

