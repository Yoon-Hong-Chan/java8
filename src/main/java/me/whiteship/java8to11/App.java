package me.whiteship.java8to11;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {

    public static void main(String[] arg){
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Callable<String> hello = ()-> {
            Thread.sleep(2000L);
            return "hellow";
        };

        Future<String> submit = executorService.submit(hello);
        System.out.println(submit.isDone());
        System.out.println("Started!");
        submit.cancel(true);
//        submit.get(); // 블락킹 콜
        System.out.println(submit.isDone());
        System.out.println("End!!");
        executorService.shutdown();
    }

    private static Runnable getRunnable(String msg){
        return ()-> System.out.println(msg + Thread.currentThread().getName());
    }
}
