package me.whiteship.java8to11;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;

@MyAnnotation
@MyAnnotation(20)
@MyAnnotation(30)
public class App {

    public static void main(String[] arg) throws ExecutionException, InterruptedException {
//        CompletableFutureClass.run();
//        ParallelSort.run();
        FeelsLikeChicken<String> names = new FeelsLikeChicken<>();
        names.print("aaa");
        MyAnnotation[] myAnnotations = App.class.getAnnotationsByType(MyAnnotation.class);
        Arrays.stream(myAnnotations).forEach(myAnnotation -> {
            System.out.println("value = "+myAnnotation.value());
        });
        Myannotations annotationsByType = App.class.getAnnotation(Myannotations.class);
        Arrays.stream(annotationsByType.value()).forEach(myAnnotation -> {
            System.out.println("value = "+myAnnotation.value());
        });


    }
}
