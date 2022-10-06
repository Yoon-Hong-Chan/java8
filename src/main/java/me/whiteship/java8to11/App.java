package me.whiteship.java8to11;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class App {

    public static void main(String[] arg) throws InterruptedException {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime birthDay =
            LocalDateTime.of(1982,8,26,0,0,0);

        ZonedDateTime nowInKorea = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println(nowInKorea);

        Instant nowInstant = Instant.now();
        ZonedDateTime zonedDateTime = nowInstant.atZone(ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTime);
        zonedDateTime.toInstant();
    }
}
