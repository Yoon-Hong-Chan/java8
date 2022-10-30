package me.whiteship.java8to11;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.TYPE_PARAMETER})
@Target({ElementType.TYPE_USE})
@Retention(RetentionPolicy.SOURCE)
@Repeatable(Myannotations.class)
public @interface MyAnnotation {
        int aaa = 10;
        int value() default aaa;
//        int count() default 1;
//        String testedBy() default "Yoons";
//        String[] testTools() default {"Hong","Chan"};
}
