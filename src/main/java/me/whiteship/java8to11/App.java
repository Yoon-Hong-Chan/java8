package me.whiteship.java8to11;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] arg){
//        List<OnlineClass> springClass = new ArrayList<>();
//        springClass.add(new OnlineClass(1,"spring boot",true));
//        springClass.add(new OnlineClass(2,"spring data jpa",true));
//        springClass.add(new OnlineClass(3,"spring mvc",false));
//        springClass.add(new OnlineClass(4,"spring core",false));
//        springClass.add(new OnlineClass(5,"rest api development",false));
        for (Direction direction:Direction.values()){
            System.out.println(direction.name()+"/"+direction.getValue() + "/" + direction.getSymbol() + "/"+ direction.ordinal());
        }
        innerClass aClass = new innerClass();
        innerClass.ZipAddress zipAddress = new innerClass.ZipAddress();
        aClass.name = "aaa";
        aClass.zipAddress.printName();

    }
}
