package com.dp.structural.singleton;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedSingletonTest {

    @Test
    public void testSyncSingleton() throws InterruptedException {

        ExecutorService executor = Executors.newWorkStealingPool();

        List<Callable<Integer>> callables = Arrays.asList(
                () -> SynchronizedSingleton.getInstance().hashCode(),
                () -> SynchronizedSingleton.getInstance().hashCode(),
                () -> SynchronizedSingleton.getInstance().hashCode());

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
    }
}
