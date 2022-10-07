package me.whiteship.java8to11;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {

    public static void main(String[] arg) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<String> hello = ()-> {
            Thread.sleep(2000L);
            return "Hello";
        };

        Callable<String> java = ()-> {
            Thread.sleep(3000L);
            return "Java";
        };

        Callable<String> keesun = ()-> {
            Thread.sleep(1000L);
            return "Keesun";
        };
//        String s = executorService.invokeAny(Arrays.asList(hello,java,keesun));
//        System.out.println(s);

        List<Future<String>> futures = executorService.invokeAll(Arrays.asList(hello,java,keesun));
        for(Future<String> future : futures){
            System.out.println(future.get());
        }

        executorService.shutdown();
    }

    private static Runnable getRunnable(String msg){
        return ()-> System.out.println(msg + Thread.currentThread().getName());
    }
}
