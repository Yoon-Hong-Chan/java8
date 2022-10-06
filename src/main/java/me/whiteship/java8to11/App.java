package me.whiteship.java8to11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class App {

    public static void main(String[] arg) throws InterruptedException {
        LocalDate today = LocalDate.now();
        LocalDate thisYearBirthDay = LocalDate.of(2022, 9,1);

        Period period = Period.between(today,thisYearBirthDay);
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        Instant now = Instant.now();
        Instant plus = now.plus(10, ChronoUnit.SECONDS);
        Duration between = Duration.between(now,plus);
        System.out.println(between.getSeconds());

    }
}
