package me.whiteship.java8to11;

@MyAnnotation
public class FeelsLikeChicken<@MyAnnotation T>{
    public <@MyAnnotation C> void print(C c){
        System.out.println(c);
    }
}
