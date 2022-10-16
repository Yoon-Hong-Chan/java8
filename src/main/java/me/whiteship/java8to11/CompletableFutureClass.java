package me.whiteship.java8to11;

import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureClass {
    public static void run() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello "+ Thread.currentThread().getName());
            return "hello";
        },executorService).thenApply(s -> {
            System.out.println("Hello2 :"+Thread.currentThread().getName());
            return s.toLowerCase(Locale.ROOT);
        });

        CompletableFuture<Void> future2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello3 "+ Thread.currentThread().getName());
            return "hello3";
        }).thenRun(() -> {
            System.out.println("End future2 ");
        });

        System.out.println("Start");
        System.out.println("result :" + future.get());
        future2.get();
        System.out.println("End");

    }
}
