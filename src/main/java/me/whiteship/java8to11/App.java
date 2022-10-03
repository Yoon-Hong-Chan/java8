package me.whiteship.java8to11;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] arg){
        List<OnlineClass> springClass = new ArrayList<>();
        springClass.add(new OnlineClass(1,"spring boot",true));
//        springClass.add(new OnlineClass(2,"spring data jpa",true));
//        springClass.add(new OnlineClass(3,"spring mvc",false));
//        springClass.add(new OnlineClass(4,"spring core",false));
        springClass.add(new OnlineClass(5,"rest api development",false));
        Optional<OnlineClass> spring = springClass.stream()
                .filter(onlineClass -> onlineClass.getTitle().startsWith("spring"))
                .findFirst();
        boolean present = spring.isPresent();
        System.out.println(present);

        spring.ifPresent(onlineClass -> System.out.println(onlineClass.getTitle()));

        OnlineClass onlineClass = spring.orElseGet(App::createNewClass);
        System.out.println(onlineClass.getTitle());

        Optional<OnlineClass> onlineClass2 = spring.filter(onlineClass1 -> onlineClass1.getId() > 10);
        System.out.println(onlineClass2.isPresent());

        Optional<Integer> onlineClass3 = spring.map(OnlineClass::getId);
        System.out.println(onlineClass3.get());
    }

    private static OnlineClass createNewClass(){
        return new OnlineClass(0,"New Class",false);
    }
}
