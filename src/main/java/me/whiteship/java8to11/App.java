package me.whiteship.java8to11;

import static net.bytebuddy.matcher.ElementMatchers.named;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;

@MyAnnotation
@MyAnnotation(20)
@MyAnnotation(30)
public class App {

    public static void main(String[] arg) throws ExecutionException, InterruptedException {
//        CompletableFutureClass.run();
//        ParallelSort.run();
//        FeelsLikeChicken<String> names = new FeelsLikeChicken<>();
//        names.print("aaa");
//        MyAnnotation[] myAnnotations = App.class.getAnnotationsByType(MyAnnotation.class);
//        Arrays.stream(myAnnotations).forEach(myAnnotation -> {
//            System.out.println("value = "+myAnnotation.value());
//        });
//        Myannotations annotationsByType = App.class.getAnnotation(Myannotations.class);
//        Arrays.stream(annotationsByType.value()).forEach(myAnnotation -> {
//            System.out.println("value = "+myAnnotation.value());
//        });

//        try {
//            new ByteBuddy().redefine(Moja.class)
//                    .method(named("pullOut")).intercept(FixedValue.value("Rabbit!"))
//                    .make().saveIn(new File("/Users/윤홍찬/Desktop/공부/java8/target/classes/"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println(new Moja().pullOut());
    }
}
