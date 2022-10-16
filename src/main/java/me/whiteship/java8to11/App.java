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
        CompletableFutureClass.run();
    }
}
