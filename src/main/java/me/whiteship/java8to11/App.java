package me.whiteship.java8to11;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] arg) throws InterruptedException {
        Instant instant = Instant.now();
        System.out.println(instant); // 기준시 UTC
        System.out.println(instant.atZone(ZoneId.of("UTC"))); // 기준시 UTC

        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);
        ZonedDateTime zonedDateTime = instant.atZone(zone);
        System.out.println(zonedDateTime);
    }
}
