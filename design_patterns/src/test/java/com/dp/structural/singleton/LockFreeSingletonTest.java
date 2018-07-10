package com.dp.structural.singleton;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LockFreeSingletonTest {

    @Test
    public void testLockFreeSingleton() throws InterruptedException {

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
    }

}
