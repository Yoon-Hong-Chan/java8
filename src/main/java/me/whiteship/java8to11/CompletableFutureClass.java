package me.whiteship.java8to11;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureClass {
    public static void run() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello start");
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello "+ Thread.currentThread().getName());
            return "hello";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Hello2 start");
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello2 "+ Thread.currentThread().getName());
            return "hello2";
        });


//        CompletableFuture<String> future2 = future.thenCompose(CompletableFutureClass::getworld);

        System.out.println("Start");
//        System.out.println("result :" + future.get());
//        System.out.println("result2 :" + future2.get());
//
        CompletableFuture<Void> finalFuture = CompletableFuture.allOf(future,future2)
                .thenAccept(System.out::println);
        finalFuture.get();
        System.out.println("End");
    }

    private static CompletableFuture<String> getworld(String message) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Helloworld "+ Thread.currentThread().getName());
            return message+"hello3";
        });
    }

}
